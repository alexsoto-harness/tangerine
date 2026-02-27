# Tangerine Spring Boot Sample!

A Spring Boot reference application demonstrating a complete CI/CD pipeline with GitHub Actions and Harness.

## What's Included

- **Spring Boot App** (Java 17, Maven)
- **Dockerfile** for containerization
- **Kubernetes manifests** for GKE deployment
- **GitHub Actions CI** for build, scan, and artifact signing
- **Harness CD** for deployment to GKE

---

## Project Structure

```
src/main/java/com/harness/    # Application code
k8s/                          # Kubernetes manifests (Harness-templated)
.github/workflows/ci.yml      # GitHub Actions CI pipeline
security-scans/               # SBOM and security scan results
```

---

## CI/CD Pipeline

### GitHub Actions (CI)

The pipeline (`.github/workflows/ci.yml`) runs on push to `main`:

1. **Build** - Maven build, SBOM generation, Docker image push to DockerHub
2. **Scan** - Gitleaks secret scanning, Snyk container vulnerability scan
3. **Sign** - Triggers Harness signing pipeline via webhook
4. **Notify** - Triggers Harness CD pipeline via webhook

#### Required GitHub Secrets

- `DOCKERHUB_TOKEN` - DockerHub access token
- `SNYK_TOKEN` - Snyk API token
- `HARNESS_SIGNING_WEBHOOK_URL` - Harness signing pipeline webhook
- `HARNESS_WEBHOOK_URL` - Harness CD pipeline webhook

#### Required GitHub Variables

- `DOCKERHUB_USERNAME` - DockerHub username
- `SNYK_ORG` - Snyk organization ID

### Harness (CD + STO + SCS)

Harness handles:
- **Security scan ingestion via STO**
- **SLSA provenance generation and attestation**
- **SLSA verification before deployment**
- **Kubernetes deployment to GKE**
- **Governance and compliancevia OPA policies**


---

## Kubernetes Manifests

The `k8s/` directory contains Harness-templated manifests:

- `deployment.yaml` - Deployment with Harness expressions
- `service.yaml` - LoadBalancer service
- `values.yaml` - Template values using Harness expressions (e.g., `<+artifact.image>`)

---

## Local Development

```bash
# Build
mvn clean install

# Run locally
mvn spring-boot:run

# Build Docker image
docker build -t tangerine-spring-boot-sample .
```

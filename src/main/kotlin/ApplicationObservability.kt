class ApplicationObservability: Telemetry {
    override fun getMetric(any: Any): String {
        return "metrics: ${any.toString()}"
    }
}
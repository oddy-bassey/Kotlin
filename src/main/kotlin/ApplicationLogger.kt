class ApplicationLogger (private val delegate: Logger, private val observability: Telemetry):
    Logger by delegate, Telemetry by observability

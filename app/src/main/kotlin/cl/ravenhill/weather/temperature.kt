package cl.ravenhill.weather

/**
 * Categorizes a temperature value into a descriptive label.
 *
 * This function evaluates the given [temperature] and returns a label such as "Cold" or "Hot" depending on the numeric
 * range it falls into.
 *
 * ## Categories:
 * - Below 0°C → `"Below freezing"`
 * - 0°C to 15°C → `"Cold"`
 * - 16°C to 25°C → `"Mild"`
 * - 26°C to 35°C → `"Warm"`
 * - Above 35°C → `"Hot"`
 *
 * ## Usage:
 * ```kotlin
 * println(temperatureCategory(-5.0))  // Output: Below freezing
 * println(temperatureCategory(10.0))  // Output: Cold
 * println(temperatureCategory(20.0))  // Output: Mild
 * println(temperatureCategory(30.0))  // Output: Warm
 * println(temperatureCategory(40.0))  // Output: Hot
 * ```
 *
 * @param temperature A temperature value in degrees Celsius.
 * @return A string label describing the temperature range.
 */
fun temperatureCategory(temperature: Double) = when {
    temperature < 0 -> "Below freezing"
    temperature <= 15 -> "Cold"
    temperature <= 25 -> "Mild"
    temperature <= 35 -> "Warm"
    else -> "Hot"
}

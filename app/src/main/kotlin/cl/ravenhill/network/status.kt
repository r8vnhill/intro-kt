package cl.ravenhill.network

/**
 * Returns a human-readable description based on the given status.
 *
 * This function takes a value of any type and returns a corresponding status message based on predefined
 * HTTP codes or keywords. It uses a `when` expression with smart casting and type checking to handle multiple cases.
 *
 * ## Handled cases:
 * - `200`, `201`, `204` → `"Success"`
 * - `400` → `"Bad Request"`
 * - `404` → `"Not Found"`
 * - `500` → `"Internal Server Error"`
 * - `"timeout"` → `"The request timed out"`
 * - Any other [Int] → `"Unhandled status code: ..."`
 * - Any other non-[String] type → `"Unknown type"`
 * - Any other [String] → `"Unhandled string: ..."`
 *
 * ## Usage:
 * ```kotlin
 * println(describeStatus(200))        // Output: Success
 * println(describeStatus("timeout"))  // Output: The request timed out
 * println(describeStatus(503))        // Output: Unhandled status code: 503
 * println(describeStatus(true))       // Output: Unknown type
 * println(describeStatus("unknown"))  // Output: Unhandled string: unknown
 * ```
 *
 * @param status The value to describe, which may be an [Int], [String], or other type.
 * @return A [String] message describing the status.
 */
fun describeStatus(status: Any) = when (status) {
    200, 201, 204 -> "Success"
    400 -> "Bad Request"
    404 -> "Not Found"
    500 -> "Internal Server Error"
    "timeout" -> "The request timed out"
    is Int -> "Unhandled status code: $status"
    !is String -> "Unknown type"
    else -> "Unhandled string: $status"
}

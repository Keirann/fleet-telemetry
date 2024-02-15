object FleetCount {

  // Define a case class to represent a vehicle
  case class Vehicle(id: String, make: String, model: String)

  def main(args: Array[String]): Unit = {

    // Sample data for vehicles
    val vehicles = List(
      Vehicle("1", "Toyota", "Camry"),
      Vehicle("2", "Honda", "Civic"),
      Vehicle("3", "Ford", "F-150"),
      Vehicle("4", "Chevrolet", "Silverado")
    )

    // Calculate the total fleet count
    val fleetCount = vehicles.size

    // Print the fleet count
    println(s"The total fleet count is: $fleetCount")
  }
}

~~~mermaid
classDiagram
    class Restaurant {
        Long id
        String name
        String location
        String contactInfo
        List<MenuItem> menuItems
        List<String> images
        +updateProfile(name, location, contactInfo, images)
        +addMenuItem(menuItem)
        +uploadImage(image)
    }

    class MenuItem {
        Long id
        String name
        String description
        Double price
    }

    class RestaurantController {
        +updateProfile()
        +addMenuItem()
        +uploadImage()
    }

    class RestaurantService {
        +updateProfile(restaurant: Restaurant)
        +addMenuItem(id: Long, menuItem: MenuItem)
        +uploadImage(id: Long, image: String)
    }

    class RestaurantRepository {
        +save(restaurant: Restaurant)
        +findById(id: Long): Restaurant
    }

    RestaurantController --> RestaurantService
    RestaurantService --> RestaurantRepository
    Restaurant --> MenuItem
~~~

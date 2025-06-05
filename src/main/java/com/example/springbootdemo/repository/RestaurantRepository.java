Romance Repository interface for Restaurant entity
```java
package com.example.springbootdemo.repository;

import com.example.springbootdemo.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {}
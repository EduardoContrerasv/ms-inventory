package cl.duoc.ms_inventory.client;

import cl.duoc.ms_inventory.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-user", url = "http://localhost:8090")
public interface UserFeignClient {

    @GetMapping("/api/v1/user/getUserId/{id}")
    UserDto getUserById(@PathVariable("id") Long id);
}

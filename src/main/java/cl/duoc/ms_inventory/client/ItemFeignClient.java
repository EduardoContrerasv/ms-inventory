package cl.duoc.ms_inventory.client;

import cl.duoc.ms_inventory.dto.ItemDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "ms-item",url = "http://localhost:8092")
public interface ItemFeignClient {

    @GetMapping("/api/v1/item/getItemId/{id}")
    ItemDto getItemById(@PathVariable("id") Long id);
}
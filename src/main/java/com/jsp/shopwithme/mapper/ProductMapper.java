package com.jsp.shopwithme.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jsp.shopwithme.dto.ItemDto;
import com.jsp.shopwithme.dto.ProductDto;
import com.jsp.shopwithme.entity.Item;
import com.jsp.shopwithme.entity.Merchant;
import com.jsp.shopwithme.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

	@Mapping(target = "name", expression = "java(productDto.getName())")
	@Mapping(target = "merchant", expression = "java(merchant)")
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "approved", ignore = true)
	Product toProductEntity(ProductDto productDto, Merchant merchant);

	ProductDto toProductDto(Product product);

	List<ProductDto> toProductDtoList(List<Product> products);
	
	@Mapping(target = "name", expression = "java(item.getProduct().getName())")
	@Mapping(target = "brand", expression = "java(item.getProduct().getBrand())")
	@Mapping(target = "category", expression = "java(item.getProduct().getCategory())")
	@Mapping(target = "price", expression = "java(item.getProduct().getPrice())")
	@Mapping(target = "productId", expression = "java(item.getProduct().getId())")
	ItemDto toItemDto(Item item);

	List<ItemDto> toItemsDtoList(List<Item> items);

}
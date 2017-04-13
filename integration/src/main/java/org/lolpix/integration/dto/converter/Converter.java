package org.lolpix.integration.dto.converter;

public interface Converter<ModelType, DtoType> {

	ModelType toModel(DtoType dto);

	DtoType toDto(ModelType model);
}

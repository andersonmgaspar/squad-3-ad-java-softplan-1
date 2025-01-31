package br.com.squadjoaquina.errorlogger.mapper;

import br.com.squadjoaquina.errorlogger.dto.ErrorDTO;
import br.com.squadjoaquina.errorlogger.model.Error;

public class ErrorMapper {

    private ErrorMapper() {
        super();
    }

    public static Error toError(ErrorDTO errorDTO) {
        Error error = new Error();

        error.setId(errorDTO.getId());
        error.setCreatedAt(errorDTO.getCreatedAt());
        error.setDescription(errorDTO.getDescription());
        error.setEnvironment(errorDTO.getEnvironment());
        error.setLevel(errorDTO.getLevel());
        error.setOrigin(errorDTO.getOrigin());
        error.setTitle(errorDTO.getTitle());
        error.setUserID(errorDTO.getUserID());
        error.setArchivedAt(errorDTO.getArchivedAt());
        return error;
    }

    public static ErrorDTO toDTO(Error error) {
        ErrorDTO errorDTO = new ErrorDTO();

        errorDTO.setId(error.getId());
        errorDTO.setCreatedAt(error.getCreatedAt());
        errorDTO.setDescription(error.getDescription());
        errorDTO.setEnvironment(error.getEnvironment());
        errorDTO.setLevel(error.getLevel());
        errorDTO.setOrigin(error.getOrigin());
        errorDTO.setTitle(error.getTitle());
        errorDTO.setUserID(error.getUserID());
        errorDTO.setArchivedAt(error.getArchivedAt());
        return errorDTO;
    }
}

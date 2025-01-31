package br.com.squadjoaquina.errorlogger.dto;

import br.com.squadjoaquina.errorlogger.model.Environment;
import br.com.squadjoaquina.errorlogger.model.Level;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@ApiModel("Error")
@Getter
@Setter
@NoArgsConstructor
public class ErrorDTO {

    @ApiModelProperty(notes = "Id do erro gerado pela base de dados.")
    private Long id;

    @ApiModelProperty(notes = "Aplicação que deu origem ao erro.", required =
            true)
    @NotBlank
    private String origin;

    @ApiModelProperty(notes = "Título do erro.\n" +
                              "Recomenda-se a utilização do nome " +
                              "da Exception (ou equivalente).", required = true)
    @NotBlank
    private String title;

    @ApiModelProperty(notes = "Descrição do erro\n" +
                              "Recomenda-se a utilização do stacktrace " +
                              "(ou equivalente).")
    private String description;

    @ApiModelProperty(notes = "Id do User que registrou o erro.",
            required = true)
    @NotNull
    private Long userID;

    @ApiModelProperty(notes = "Level de severidade do erro", required = true)
    @NotNull
    private Level level;

    @ApiModelProperty(notes = "Ambiente no qual ocorreu o erro.",
            required = true)
    @NotNull
    private Environment environment;

    @ApiModelProperty(notes = "Data de arquivação do erro.")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonFormat(pattern = "dd-MM-yyyy H:mm:ss")
    private LocalDateTime archivedAt;

    @ApiModelProperty(notes = "Data de criação do erro. Imutável.")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonFormat(pattern = "dd-MM-yyyy H:mm:ss")
    private LocalDateTime createdAt;
}

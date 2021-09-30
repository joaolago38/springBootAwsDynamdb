package br.com.aws.dynamodb;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public enum ErrorMessage {

    E000("0000", "Código do Actor não foi encontrado"),
    E001("0001", "Código do Adress não foi encontrado"),
    E002("0002", "Código do Category não foi encontrado"),
    E003("0002", "Código do City não foi encontrado"),
    E004("0002", "Código do Film não foi encontrado"),
    E005("0002", "Código do FilmActor não foi encontrado"),
    E006("0006", "Código do Language não foi encontrado"),
    E007("0007", "Código do Payment não foi encontrado"),
    E008("0008", "Código do Rental não foi encontrado"),
    E009("0009", "Código do Staff não foi encontrado"),
    E0010("0002", "Código do Store não foi encontrado"),
    E0011("0003", "Código do Inventory não foi encontrado"),
    E9998("0002", "Código do FilmActor não foi encontrado");


    private final String codigo;
    private final String mensagem;

    public String getCodigo() {
        return codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

    ErrorMessage(String codigo, String mensagem) {
        this.codigo = codigo;
        this.mensagem = mensagem;
    }


    public String getMensagemCompleta() {
        return this.mensagem + " (Erro: " + this.codigo + ")";
    }

    public String formatarMensagem(Object... itens) {
        try {
            return String.format(this.mensagem, itens);
        } catch (Exception e) {
            log.error(
                    "Não foi possível interpolar a mensagem da chave [{}], aplicando os argumentos , {}",
                    this.codigo,
                    Arrays.toString(itens));
            return E9998.mensagem;
        }
    }
}

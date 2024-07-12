package br.com.alurafood.pedidos.amqp;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentoListener {
    @RabbitListener(queues = "pagamento.concluido")
    public void recebeMensagem(Message menssagem) {
        System.out.println("Recebi a mensagem " + menssagem.toString());
    }
}

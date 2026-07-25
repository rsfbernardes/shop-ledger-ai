package br.com.rsfbernardes.shopledger.ai.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
@SystemMessage(fromResource = "prompts/system-prompt.txt")
public interface ShopLedgerAIService {

    String chat(@UserMessage String message);

}
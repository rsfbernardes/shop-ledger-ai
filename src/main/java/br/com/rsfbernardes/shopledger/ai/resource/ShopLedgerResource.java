package br.com.rsfbernardes.shopledger.ai.resource;

import br.com.rsfbernardes.shopledger.ai.service.ShopLedgerAIService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/api/v1/chat")
public class ShopLedgerResource {

    @Inject
    ShopLedgerAIService shopLedgerAIService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String chat(@QueryParam("message") String message) {
        return shopLedgerAIService.chat(message);
    }

}

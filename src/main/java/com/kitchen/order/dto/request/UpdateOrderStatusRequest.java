package com.kitchen.order.dto.request;

import com.kitchen.order.enums.OrderStatus;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateOrderStatusRequest {

    @NotNull(message = "status is required")
    private OrderStatus status;

    /**
     * Required when transitioning to CANCELLED.
     * The service layer enforces this rule — not enforced here via annotation
     * because it is conditionally mandatory.
     */
    private String reason;
}

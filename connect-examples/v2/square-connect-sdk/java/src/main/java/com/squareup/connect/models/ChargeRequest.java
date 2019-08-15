/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.AdditionalRecipient;
import com.squareup.connect.models.Address;
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the parameters that can be included in the body of a request to the [Charge](#endpoint-charge) endpoint.  Deprecated - recommend using [CreatePayment](#endpoint-payments-createpayment)
 */
@ApiModel(description = "Defines the parameters that can be included in the body of a request to the [Charge](#endpoint-charge) endpoint.  Deprecated - recommend using [CreatePayment](#endpoint-payments-createpayment)")

public class ChargeRequest {
  @JsonProperty("idempotency_key")
  private String idempotencyKey = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  @JsonProperty("card_nonce")
  private String cardNonce = null;

  @JsonProperty("customer_card_id")
  private String customerCardId = null;

  @JsonProperty("delay_capture")
  private Boolean delayCapture = null;

  @JsonProperty("reference_id")
  private String referenceId = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("customer_id")
  private String customerId = null;

  @JsonProperty("billing_address")
  private Address billingAddress = null;

  @JsonProperty("shipping_address")
  private Address shippingAddress = null;

  @JsonProperty("buyer_email_address")
  private String buyerEmailAddress = null;

  @JsonProperty("order_id")
  private String orderId = null;

  @JsonProperty("additional_recipients")
  private List<AdditionalRecipient> additionalRecipients = new ArrayList<AdditionalRecipient>();

  @JsonProperty("verification_token")
  private String verificationToken = null;

  public ChargeRequest idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A value you specify that uniquely identifies this transaction among transactions you've created.  If you're unsure whether a particular transaction succeeded, you can reattempt it with the same idempotency key without worrying about double-charging the buyer.  See [Idempotency](/basics/api101/idempotency) for more information.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "A value you specify that uniquely identifies this transaction among transactions you've created.  If you're unsure whether a particular transaction succeeded, you can reattempt it with the same idempotency key without worrying about double-charging the buyer.  See [Idempotency](/basics/api101/idempotency) for more information.")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  public ChargeRequest amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The amount of money to charge.  Note that you specify the amount in the __smallest denomination of the applicable currency__. For example, US dollar amounts are specified in cents. See [Working with monetary amounts](#workingwithmonetaryamounts) for details.  The value of `currency` must match the currency associated with the business that is charging the card.
   * @return amountMoney
  **/
  @ApiModelProperty(required = true, value = "The amount of money to charge.  Note that you specify the amount in the __smallest denomination of the applicable currency__. For example, US dollar amounts are specified in cents. See [Working with monetary amounts](#workingwithmonetaryamounts) for details.  The value of `currency` must match the currency associated with the business that is charging the card.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public ChargeRequest cardNonce(String cardNonce) {
    this.cardNonce = cardNonce;
    return this;
  }

   /**
   * A nonce generated from the `SqPaymentForm` that represents the card to charge.  The application that provides a nonce to this endpoint must be the _same application_ that generated the nonce with the `SqPaymentForm`. Otherwise, the nonce is invalid.  Do not provide a value for this field if you provide a value for `customer_card_id`.
   * @return cardNonce
  **/
  @ApiModelProperty(value = "A nonce generated from the `SqPaymentForm` that represents the card to charge.  The application that provides a nonce to this endpoint must be the _same application_ that generated the nonce with the `SqPaymentForm`. Otherwise, the nonce is invalid.  Do not provide a value for this field if you provide a value for `customer_card_id`.")
  public String getCardNonce() {
    return cardNonce;
  }

  public void setCardNonce(String cardNonce) {
    this.cardNonce = cardNonce;
  }

  public ChargeRequest customerCardId(String customerCardId) {
    this.customerCardId = customerCardId;
    return this;
  }

   /**
   * The ID of the customer card on file to charge. Do not provide a value for this field if you provide a value for `card_nonce`.  If you provide this value, you _must_ also provide a value for `customer_id`.
   * @return customerCardId
  **/
  @ApiModelProperty(value = "The ID of the customer card on file to charge. Do not provide a value for this field if you provide a value for `card_nonce`.  If you provide this value, you _must_ also provide a value for `customer_id`.")
  public String getCustomerCardId() {
    return customerCardId;
  }

  public void setCustomerCardId(String customerCardId) {
    this.customerCardId = customerCardId;
  }

  public ChargeRequest delayCapture(Boolean delayCapture) {
    this.delayCapture = delayCapture;
    return this;
  }

   /**
   * If `true`, the request will only perform an Auth on the provided card. You can then later perform either a Capture (with the [CaptureTransaction](#endpoint-capturetransaction) endpoint) or a Void (with the [VoidTransaction](#endpoint-voidtransaction) endpoint).  Default value: `false`
   * @return delayCapture
  **/
  @ApiModelProperty(value = "If `true`, the request will only perform an Auth on the provided card. You can then later perform either a Capture (with the [CaptureTransaction](#endpoint-capturetransaction) endpoint) or a Void (with the [VoidTransaction](#endpoint-voidtransaction) endpoint).  Default value: `false`")
  public Boolean getDelayCapture() {
    return delayCapture;
  }

  public void setDelayCapture(Boolean delayCapture) {
    this.delayCapture = delayCapture;
  }

  public ChargeRequest referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * An optional ID you can associate with the transaction for your own purposes (such as to associate the transaction with an entity ID in your own database).  This value cannot exceed 40 characters.
   * @return referenceId
  **/
  @ApiModelProperty(value = "An optional ID you can associate with the transaction for your own purposes (such as to associate the transaction with an entity ID in your own database).  This value cannot exceed 40 characters.")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public ChargeRequest note(String note) {
    this.note = note;
    return this;
  }

   /**
   * An optional note to associate with the transaction.  This value cannot exceed 60 characters.
   * @return note
  **/
  @ApiModelProperty(value = "An optional note to associate with the transaction.  This value cannot exceed 60 characters.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public ChargeRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * The ID of the customer to associate this transaction with. This field is required if you provide a value for `customer_card_id`, and optional otherwise.
   * @return customerId
  **/
  @ApiModelProperty(value = "The ID of the customer to associate this transaction with. This field is required if you provide a value for `customer_card_id`, and optional otherwise.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public ChargeRequest billingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * The buyer's billing address.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The buyer's billing address.")
  public Address getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public ChargeRequest shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * The buyer's shipping address, if available.
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "The buyer's shipping address, if available.")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public ChargeRequest buyerEmailAddress(String buyerEmailAddress) {
    this.buyerEmailAddress = buyerEmailAddress;
    return this;
  }

   /**
   * The buyer's email address, if available.
   * @return buyerEmailAddress
  **/
  @ApiModelProperty(value = "The buyer's email address, if available.")
  public String getBuyerEmailAddress() {
    return buyerEmailAddress;
  }

  public void setBuyerEmailAddress(String buyerEmailAddress) {
    this.buyerEmailAddress = buyerEmailAddress;
  }

  public ChargeRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The ID of the order to associate with this transaction.  If you provide this value, the `amount_money` value of your request must __exactly match__ the value of the order's `total_money` field.
   * @return orderId
  **/
  @ApiModelProperty(value = "The ID of the order to associate with this transaction.  If you provide this value, the `amount_money` value of your request must __exactly match__ the value of the order's `total_money` field.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public ChargeRequest additionalRecipients(List<AdditionalRecipient> additionalRecipients) {
    this.additionalRecipients = additionalRecipients;
    return this;
  }

  public ChargeRequest addAdditionalRecipientsItem(AdditionalRecipient additionalRecipientsItem) {
    this.additionalRecipients.add(additionalRecipientsItem);
    return this;
  }

   /**
   * The basic primitive of multi-party transaction. The value is optional. The transaction facilitated by you can be split from here.  If you provide this value, the `amount_money` value in your additional_recipients must not be more than 90% of the `amount_money` value in the charge request. The `location_id` must be the valid location of the app owner merchant.  This field requires the `PAYMENTS_WRITE_ADDITIONAL_RECIPIENTS` OAuth permission.  This field is currently not supported in sandbox.
   * @return additionalRecipients
  **/
  @ApiModelProperty(value = "The basic primitive of multi-party transaction. The value is optional. The transaction facilitated by you can be split from here.  If you provide this value, the `amount_money` value in your additional_recipients must not be more than 90% of the `amount_money` value in the charge request. The `location_id` must be the valid location of the app owner merchant.  This field requires the `PAYMENTS_WRITE_ADDITIONAL_RECIPIENTS` OAuth permission.  This field is currently not supported in sandbox.")
  public List<AdditionalRecipient> getAdditionalRecipients() {
    return additionalRecipients;
  }

  public void setAdditionalRecipients(List<AdditionalRecipient> additionalRecipients) {
    this.additionalRecipients = additionalRecipients;
  }

  public ChargeRequest verificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
    return this;
  }

   /**
   * An identifying token generated by `SqPaymentForm.verifyBuyer()`. Verification tokens encapsulate customer device information and 3-D Secure challenge results to indicate that Square has verified the buyer identity.
   * @return verificationToken
  **/
  @ApiModelProperty(value = "An identifying token generated by `SqPaymentForm.verifyBuyer()`. Verification tokens encapsulate customer device information and 3-D Secure challenge results to indicate that Square has verified the buyer identity.")
  public String getVerificationToken() {
    return verificationToken;
  }

  public void setVerificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeRequest chargeRequest = (ChargeRequest) o;
    return Objects.equals(this.idempotencyKey, chargeRequest.idempotencyKey) &&
        Objects.equals(this.amountMoney, chargeRequest.amountMoney) &&
        Objects.equals(this.cardNonce, chargeRequest.cardNonce) &&
        Objects.equals(this.customerCardId, chargeRequest.customerCardId) &&
        Objects.equals(this.delayCapture, chargeRequest.delayCapture) &&
        Objects.equals(this.referenceId, chargeRequest.referenceId) &&
        Objects.equals(this.note, chargeRequest.note) &&
        Objects.equals(this.customerId, chargeRequest.customerId) &&
        Objects.equals(this.billingAddress, chargeRequest.billingAddress) &&
        Objects.equals(this.shippingAddress, chargeRequest.shippingAddress) &&
        Objects.equals(this.buyerEmailAddress, chargeRequest.buyerEmailAddress) &&
        Objects.equals(this.orderId, chargeRequest.orderId) &&
        Objects.equals(this.additionalRecipients, chargeRequest.additionalRecipients) &&
        Objects.equals(this.verificationToken, chargeRequest.verificationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idempotencyKey, amountMoney, cardNonce, customerCardId, delayCapture, referenceId, note, customerId, billingAddress, shippingAddress, buyerEmailAddress, orderId, additionalRecipients, verificationToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeRequest {\n");

    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    cardNonce: ").append(toIndentedString(cardNonce)).append("\n");
    sb.append("    customerCardId: ").append(toIndentedString(customerCardId)).append("\n");
    sb.append("    delayCapture: ").append(toIndentedString(delayCapture)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    buyerEmailAddress: ").append(toIndentedString(buyerEmailAddress)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    additionalRecipients: ").append(toIndentedString(additionalRecipients)).append("\n");
    sb.append("    verificationToken: ").append(toIndentedString(verificationToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

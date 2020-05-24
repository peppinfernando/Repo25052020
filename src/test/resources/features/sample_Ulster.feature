Feature: Application creation through Digital Zebra

  @eOBAO
  Scenario Outline: Scenario # 8070 : capture details credit card field in Zebra for <brand>
    Given I launch '<brand>' Business Onboarding & Account Opening application
    When I login with '<credentials>' to the application and navigate to homepage
    And enter personal details as '<personaldetails>' select entity as '<entity>' and fill business contact as '<business_contactdetails>' in getting started pages
    And enter financial details as '<businessfinancials>' , payment details as '<businesspayment>' and '<businessaccount>'in your business pages
    And enter team details as '<teamdetails>' in your team section and '<acountpermission>' detail in manage account section
    And select account services options as '<accountservices>' and select '<addtionalproducts>' option
#    Then customer provided with agreement light box, agreeing the condition will expand '<complexity>' form

    Examples:

      | brand | channel     | credentials                       | personaldetails  | entity          | business_contactdetails       | businessfinancials                | businesspayment                                                                                  | businessaccount                                                           | teamdetails                                                                                                        | acountpermission | accountservices                                                                             | addtionalproducts  | complexity |
#      | RBS   | BB External | peppin.fernando@gmail.com,Rose!234 | MR,Peppin,Walter | UK ,Sole Trader | Reya Tours,No,101,TW14 8AJ,No | 160000,March,2018,December,5,Tour | AllTransferNoCash,United Kingdom,sessionalbusinessNo,intTradeNo,United Kingdom,paytaxoutsideukNO | existingbusrelationshipNo,SwitchYourBusinessAccountToUsNo,MoneyComingInNo | 10,July,1983,+44,Male,United Kingdom,Bromley,personalaccountNo,June,2016,PayTaxOutUKNo,United Kingdom,77 C,BR1 3AA | NA               | checkPaperStatementsNo,Monthly,checkPayingInBookYes,checkChequeBookYes,radioAdditionalAccNo | BusinessCreditCard | Simple     |
      | Ulster  | BB External | peppin.fernando@gmail.com,Rose!234 | MR,Peppin,Walter | UK,Sole Trader  | Reya Tours,No,101,TW14 8AJ,No | 160000,March,2018,December,5,Tour | AllTransferNoCash,United Kingdom,sessionalbusinessNo,intTradeNo,United Kingdom,paytaxoutsideukNO | existingbusrelationshipNo,SwitchYourBusinessAccountToUsNo,MoneyComingInNo | 10,July,1983,+44,Male,United Kingdom,Bromley,personalaccountNo,June,2016,PayTaxOutUKNo,United Kingdom,77 C,BR1 3AA | NA               | checkPaperStatementsNo,Monthly,checkPayingInBookYes,checkChequeBookYes,radioAdditionalAccNo | BusinessCreditCard | Simple     |
#      | NatWest | BB External | peppin.fernando@gmail.com,Rose!234 | MR,Peppin,Walter | UK,Sole Trader | Reya Tours,No,101,TW14 8AJ,No | 160000,March,2018,December,5,Tour | AllTransferNoCash,United Kingdom,sessionalbusinessNo,intTradeNo,United Kingdom,paytaxoutsideukNO | existingbusrelationshipNo,SwitchYourBusinessAccountToUsNo,MoneyComingInNo | 10,July,1983,+44,Male,United Kingdom,Bromley,personalaccountNo,June,2016,PayTaxOutUKNo,United Kingdom,77 C,BR1 3AA | NA               | checkPaperStatementsNo,Monthly,checkPayingInBookYes,checkChequeBookYes,radioAdditionalAccNo | BusinessCreditCard | Complex    |

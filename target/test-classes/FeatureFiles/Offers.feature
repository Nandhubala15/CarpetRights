Feature:
@Regression
Scenario:
Login to CarpetRights
Given Go to the Carpet Rights URL
When Go to the Offers Page
Then Go to Wood Flooring Offer

@Smoke
Scenario:
Place order in Cushion

Given Go to the Curtains page
And Select Cushion Brand 
And Select Accessories
And Select Cushion Covers
And Select Color
And Select Cushion
When Select Options of Products
Then Add to the Baseket
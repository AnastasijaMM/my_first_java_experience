public class LocatorsFound {

/*Home Page*/

        .//div[@class = 'logo'].//a[@id="currentCurrency"]
        .//a[@data-label = 'Navigation']
        .//div[@class = 'sb-group dates left']/ div[@class = 'fake-field clearfix']
        .//u[@id = 'sb-country']
        .//button[@id = 'location-submit']
        .//div[@id = 'review-arrow-left']//*[@class = 'arrow-slider-circle']
        .//div[4][@class = 'tp-widget-review']
        .//div[@class = 'col-12']//*[contains(text(),"We compare")]

/* Search page*/

        .//div[@data-event-label = 'Small cars']
        .//span[@class = 'showing-cars']
        .//div[@class = 'car-top-filter-control next']
        .//a[@class = 'dc-ui dropdown-toggle text-blue-500']
        .//div[@id = 'search-filter-body']//*[contains(text(), 'Special offer')]/ancestor::div[@class = 'flt-type']   OR   .//div[@id = 'search-filter-body']//div[@class = 'flt-type']
        .//div[@id = 'filter-air-conditioning']//*[@class = 'min-price']
        .//div[@id = 'filter-fuel-type']/ label[@for = 'fuel-type-ft-V']/text()        OR   .//div[@id = 'filter-fuel-type']/ label[@for = 'fuel-type-ft-V']/text()[contains(.,"Gasoline")]
        .//div[@id = 'filter-number-of-seats']/ label[@data-value = 'seats-4']
        .//div[@class = 'car-box'][1]//*[contains(@class, "car-params")]//li[2]//span
        .//div[@class = 'car-box'][1]//a[@data-title = 'Rental Conditions']
        .//div[@class = 'car-box'][1]//*[contains(@class, 'submit')]
        .//div[@class = 'car-box'][2]//*[contains(@class, 'dc-ui badge badge-medium badge-blue')]
        .//div[@class = 'car-box'][2]//*[contains(@class, 'supplier-rating')]
        .//div[@class = 'car-box'][2]//*[contains(@class, 'price-item-price-main')]

/* In Progress Page */

/* To freeze "in progress page" in Dev Tools  I've clicked at "Sources",and in the right upper corner clicked at "Pause on exceptions" */
        .//div[@class = 'lds-ellipsis v2']
        .//div[@class = 'mb-8 text-24 text-bold text-center']
        .//div[@class = 'mb-24 text-center']
}

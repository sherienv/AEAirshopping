package com.aeconnect.airshopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AEService {

    @Autowired
    RestTemplate restTemplate;

    public String invokeAEService() {
        String request = "\"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?>\\n<IATA_AirShoppingRQ xmlns=\\\"http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ\\\">\\n    <MessageDoc>\\n        <RefVersionNumber>1.0</RefVersionNumber>\\n    </MessageDoc>\\n    <Party>\\n        <Participant>\\n            <Aggregator>\\n                <AggregatorID>88888888</AggregatorID>\\n                <Name>JR TECHNOLOGIES</Name>\\n            </Aggregator>\\n        </Participant>\\n        <Sender>\\n            <TravelAgency>\\n                <AgencyID>9A</AgencyID>\\n                <IATA_Number>12312312</IATA_Number>\\n                <Name>Gods Travel</Name>\\n            </TravelAgency>\\n        </Sender>\\n    </Party>\\n    <PayloadAttributes>\\n        <EchoTokenText>ba46b1d9-215f-487b-bc66-e55c6c1000b6</EchoTokenText>\\n        <Timestamp>2001-12-17T09:30:47+05:00</Timestamp>\\n        <TrxID>transaction43</TrxID>\\n        <VersionNumber>2019.2</VersionNumber>\\n    </PayloadAttributes>\\n    <POS>\\n        <City>\\n            <IATA_LocationCode>ATH</IATA_LocationCode>\\n        </City>\\n        <Country>\\n            <CountryCode>GR</CountryCode>\\n        </Country>\\n        <RequestTime>2018-10-12T07:38:00</RequestTime>\\n    </POS>\\n    <Request>\\n        <FlightCriteria>\\n            <OriginDestCriteria>\\n                <DestArrivalCriteria>\\n                    <IATA_LocationCode>LHR</IATA_LocationCode>\\n                </DestArrivalCriteria>\\n                <OriginDepCriteria>\\n                    <Date>2020-06-20</Date>\\n                    <IATA_LocationCode>BCN</IATA_LocationCode>\\n                </OriginDepCriteria>\\n            </OriginDestCriteria>\\n            <OriginDestCriteria>\\n                <DestArrivalCriteria>\\n                    <IATA_LocationCode>BCN</IATA_LocationCode>\\n                </DestArrivalCriteria>\\n                <OriginDepCriteria>\\n                    <Date>2020-06-27</Date>\\n                    <IATA_LocationCode>LHR</IATA_LocationCode>\\n                </OriginDepCriteria>\\n                <PreferredCabinType>\\n                    <CabinTypeCode>M</CabinTypeCode>\\n                </PreferredCabinType>\\n            </OriginDestCriteria>\\n        </FlightCriteria>\\n        <Paxs>\\n            <Pax>\\n                <PaxID>Pax1</PaxID>\\n                <PTC>ADT</PTC>\\n            </Pax>\\n            <Pax>\\n                <PaxID>Pax2</PaxID>\\n                <PTC>CHD</PTC>\\n            </Pax>\\n        </Paxs>\\n        <ShoppingCriteria>\\n            <CabinTypeCriteria>\\n                <CabinTypeCode>M</CabinTypeCode>\\n            </CabinTypeCriteria>\\n        </ShoppingCriteria>\\n    </Request>\\n</IATA_AirShoppingRQ>\")";
        String response =  restTemplate.postForObject( "http://192.168.160.142:8082/aggregation-engine/ae-services/NDCAirShopping1.1.4Port", request, String.class);
        return response;
    }
}

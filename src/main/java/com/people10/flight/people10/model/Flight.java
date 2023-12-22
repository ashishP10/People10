package com.people10.flight.people10.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "flights")
public class Flight {

    @Id
    private Long id;
    private String comp;
    private String ddate;
    private String flt;
    private String leg;
    private String flstatus;
    private String fltrules;
    private String class2nav;
    private String fltype;
    private String ioe;
    private String category;
    private String divert;
    private String carrier;
    private String client;
    private String arcustno;
    private String cxrsn;
    private String route;
    private String market;
    private String base;
    private String sOrg;
    private String sDst;
    private String sgOut;
    private String slOut;
    private String sgOff;
    private String slOff;
    private String sgOn;
    private String slOn;
    private String sgIn;
    private String slIn;
    private String sTail;
    private String sActype;
    private String gEtd;
    private String lEtd;
    private String gEta;
    private String lEta;
    private String aOrg;
    private String aDst;
    private String agOut;
    private String alOut;
    private String agOff;
    private String alOff;
    private String agOn;
    private String alOn;
    private String agIn;
    private String alIn;
    private String aTail;
    private String aActype;
    private String sSeats;
    private String sRteMiles;
    private String sAsm;
    private String sBags;
    private String aSeats;
    private String aRteMiles;
    private String aBags;
    private String flcamin;
    private String flcareq;
    private String flcaasn;
    private String flfomin;
    private String flforeq;
    private String flfoasn;
    private String flfamin;
    private String flfareq;
    private String flfaasn;
    private String authc;
    private String sopen;
    private String wlist;
    private String peak;
    private String intlFlag;
    private String lockFlag;
    private String assignSeats;
    private String bpass;
    private String closeFlag;
    private String closetime;
    private String closeseq;
    private String capcnt;
    private String capdte;
    private String nfdate;
    private String nflist;
    private String sllist;
    private String dhstime;
    private String ckBags;
    private String schedule;
    private String chgtype;
    private String chgpage;
    private String chgdate;
    private String chguser;
    private String chgprog;
    private String recId;
    private String fltypeIata;
    private String apistime;
    private String flopsStatusIata;
    private String fltStatusDisplay;
    private String fuelPlan;
    private String planCalcBlockTime;
    private String departTerminal;
    private String arriveTerminal;
    private String bagClaim;
    private String departGate;
    private String arriveGate;
    private String sysStart;
    private String sysEnd;
    private String transStart;

}


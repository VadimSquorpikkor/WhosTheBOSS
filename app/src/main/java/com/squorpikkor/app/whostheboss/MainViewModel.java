package com.squorpikkor.app.whostheboss;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Objects;

import static com.squorpikkor.app.whostheboss.Pedal.ACOUSTIC;
import static com.squorpikkor.app.whostheboss.Pedal.ALL;
import static com.squorpikkor.app.whostheboss.Pedal.AMP_EMULATOR;
import static com.squorpikkor.app.whostheboss.Pedal.BASS_PEDALS;
import static com.squorpikkor.app.whostheboss.Pedal.CHORUS;
import static com.squorpikkor.app.whostheboss.Pedal.DELAY_REVERB;
import static com.squorpikkor.app.whostheboss.Pedal.DISTORTION_OVERDRIVE;
import static com.squorpikkor.app.whostheboss.Pedal.DYNAMICS_FILTER;
import static com.squorpikkor.app.whostheboss.Pedal.OTHERS;
import static com.squorpikkor.app.whostheboss.Pedal.PITCH_MODULATION;
import static com.squorpikkor.app.whostheboss.Pedal.SERIES_20;
import static com.squorpikkor.app.whostheboss.Pedal.WAZA_CRAFT;

public class MainViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Pedal>> pedalList;

    private int position;

    //Выбор устройств по одной категории. У каждого устройттва может быть несколько категорий
    public void setPedalListByCategory(int category) {
        if (category == ALL) {
            if (pedalList.getValue()!=null) pedalList.getValue().clear();
            pedalList.setValue(getAll());
        } else {

            ArrayList<Pedal> list = new ArrayList<>();
            for (Pedal pedal:getAll()) {
                for (int cat:pedal.getCategory()) {
                    if (cat == category) {
                        list.add(pedal);
                    } /*else break;*/
                }
            }
            if (pedalList.getValue()!=null) pedalList.getValue().clear();
            pedalList.setValue(list);
        }
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public MutableLiveData<ArrayList<Pedal>> getPedalList() {
        if (pedalList == null) {
            pedalList = new MutableLiveData<>();
            pedalList.setValue(getAll());
        }
        return pedalList;
    }

    private ArrayList<Pedal> getAll() {
        ArrayList<Pedal> list = new ArrayList<>();
        list.add(new Pedal("Over Drive",            "OD-1",     R.drawable.od_1,    R.drawable.od_1_small, 1977, 1988,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Spectrum",              "SP-1",     R.drawable.sp_1,    R.drawable.sp_1_small, 1977, 1981,  0,  PITCH_MODULATION));
        list.add(new Pedal("Phaser",                "PH-1",     R.drawable.ph_1,    R.drawable.ph_1_small, 1977, 1981,  0,  PITCH_MODULATION));
        list.add(new Pedal("Graphic Equalizer",     "GE-6",     R.drawable.ge_6,    R.drawable.ge_6_small, 1978, 1981,  0,  DYNAMICS_FILTER));
        list.add(new Pedal("T-Wah",                 "TW-1",     R.drawable.tw_1,    R.drawable.tw_1_small, 1978, 1988,  0,  DYNAMICS_FILTER));
        list.add(new Pedal("Touch Wah",             "TW-1",     R.drawable.tow_1,   R.drawable.tow_1_small,1978, 1988,  0,  DYNAMICS_FILTER));
        list.add(new Pedal("Distortion",            "DS-1",     R.drawable.ds_1,    R.drawable.ds_1_small, 1978, 0,     0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Compression Sustainer", "CS-1",     R.drawable.cs_1,    R.drawable.cs_1_small, 1978, 1982,  0,  DYNAMICS_FILTER));
        list.add(new Pedal("Noise Gate",            "NF-1",     R.drawable.nf_1,    R.drawable.nf_1_small, 1979, 1982,  0,  OTHERS));
        list.add(new Pedal("Slow Gear",             "SG-1",     R.drawable.sg_1,    R.drawable.sg_1_small, 1979, 1982,  0,  DYNAMICS_FILTER));
        list.add(new Pedal("Chorus",                "CE-2",     R.drawable.ce_2,    R.drawable.ce_2_small, 1979, 1991,  0,  CHORUS, PITCH_MODULATION));
        list.add(new Pedal("Flanger",               "BF-2",     R.drawable.bf_2,    R.drawable.bf_2_small, 1980, 2001,  0,  PITCH_MODULATION));
        list.add(new Pedal("Phaser",                "PH-1R",    R.drawable.ph_1r,   R.drawable.ph_1r_small,1980, 1985,  0,  PITCH_MODULATION));
        list.add(new Pedal("SUPER OverDrive",       "SD-1",     R.drawable.sd_1,    R.drawable.sd_1_small, 1981, 0,     0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Delay",                 "DM-2",     R.drawable.dm_2,    R.drawable.dm_2_small, 1981, 1984,  0,  DELAY_REVERB));
        list.add(new Pedal("Graphic Equalizer",     "GE-7",     R.drawable.ge_7,    R.drawable.ge_7_small, 1981, 0,     0,  DYNAMICS_FILTER));
        list.add(new Pedal("Compression Sustainer", "CS-2",     R.drawable.cs_2,    R.drawable.cs_2_small, 1981, 1988,  0,  DYNAMICS_FILTER));
        list.add(new Pedal("Vibrato",               "VB-2",     R.drawable.vb_2,    R.drawable.vb_2_small, 1982, 1984,  0,  PITCH_MODULATION));
        list.add(new Pedal("Octave",                "OC-2",     R.drawable.oc_2,    R.drawable.oc_2_small, 1982, 2003,  0,  PITCH_MODULATION));
        list.add(new Pedal("Power Supply & Master Switch", "PSM-5", R.drawable.psm_5, R.drawable.psm_5_small,1982, 1999,0,  OTHERS));
        list.add(new Pedal("Chorus",                "CE-3",     R.drawable.ce_3,    R.drawable.ce_3_small, 1982, 1989,  0,  CHORUS, PITCH_MODULATION));
        list.add(new Pedal("Heavy Metal",           "HM-2",     R.drawable.hm_2,    R.drawable.hm_2_small, 1983, 1992,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Digital Delay",         "DD-2",     R.drawable.dd_2,    R.drawable.dd_2_small, 1984, 1986,  0,  DELAY_REVERB));
        list.add(new Pedal("Delay",                 "DM-3",     R.drawable.dm_3,    R.drawable.dm_3_small, 1984, 1987,  0,  DELAY_REVERB));
        list.add(new Pedal("SUPER Feedbacker & Distortion", "DF-2", R.drawable.df_2,R.drawable.df_2_small, 1984, 1993,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("SUPER Phaser",          "PH-2",     R.drawable.ph_2,    R.drawable.ph_2_small, 1984, 2000,  0,  PITCH_MODULATION));
        list.add(new Pedal("Digital Sampler/Delay", "DSD-2",    R.drawable.dsd_2,   R.drawable.dsd_2_small,1985, 1986,  0,  DELAY_REVERB));
        list.add(new Pedal("TURBO OverDrive",       "OD-2",     R.drawable.od_2,    R.drawable.od_2_small, 1985, 1994,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Hi Band Flanger",       "HF-2",     R.drawable.hf_2,    R.drawable.hf_2_small, 1985, 1993,  0,  PITCH_MODULATION));
        list.add(new Pedal("Dimension C",           "DC-2",     R.drawable.dc_2,    R.drawable.dc_2_small, 1985, 1988,  0,  CHORUS, PITCH_MODULATION));
        list.add(new Pedal("Digital Sampler/Delay", "DSD-3",    R.drawable.dsd_3,   R.drawable.dsd_3_small,1986, 1989,  0,  DELAY_REVERB));
        list.add(new Pedal("Compression Sustainer", "CS-3",     R.drawable.cs_3,    R.drawable.cs_3_small, 1986, 0,     0,  DYNAMICS_FILTER));
        list.add(new Pedal("Digital Delay",         "DD-3",     R.drawable.dd_3,    R.drawable.dd_3_small, 1986, 0,     0,  DELAY_REVERB));
        list.add(new Pedal("Dynamic Filter",        "FT-2",     R.drawable.ft_2,    R.drawable.ft_2_small, 1986, 1989,  0,  DYNAMICS_FILTER));
        list.add(new Pedal("Bass Chorus",           "CE-2B",    R.drawable.ceb_2,   R.drawable.ceb_2_small,1987, 1994,  0,  CHORUS, BASS_PEDALS, PITCH_MODULATION));
        list.add(new Pedal("Bass Flanger",          "BF-2B",    R.drawable.bfb_2,   R.drawable.bfb_2_small,1987, 1993,  0,  BASS_PEDALS, PITCH_MODULATION));
        list.add(new Pedal("Bass Equalizer",        "GE-7B",    R.drawable.ge_7b,   R.drawable.ge_7b_small,1987, 1994,  0,  BASS_PEDALS, DYNAMICS_FILTER));
        list.add(new Pedal("Turbo Distortion",      "DS-2",     R.drawable.ds_2,    R.drawable.ds_2_small, 1987, 0,     0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Limiter",               "LM-2",     R.drawable.lm_2,    R.drawable.lm_2_small, 1987, 1991,  0,  DYNAMICS_FILTER));
        list.add(new Pedal("Digital Reverb",        "RV-2",     R.drawable.rv_2,    R.drawable.rv_2_small, 1987, 1989,  0,  DELAY_REVERB));
        list.add(new Pedal("Noise Suppressor",      "NS-2",     R.drawable.ns_2,    R.drawable.ns_2_small, 1987, 0,     0,  OTHERS));
        list.add(new Pedal("Digital Pitch Shifter", "PS-2",     R.drawable.ps_2,    R.drawable.ps_2_small, 1987, 1993,  0,  PITCH_MODULATION));
        list.add(new Pedal("Digital Metalizer",     "MZ-2",     R.drawable.mz_2,    R.drawable.mz_2_small, 1987, 1992,  0,  CHORUS, DISTORTION_OVERDRIVE, DELAY_REVERB, PITCH_MODULATION));
        list.add(new Pedal("Digital Dimension",     "DC-3",     R.drawable.dcc_3,   R.drawable.dcc_3_small,1988, 1992,  0,  CHORUS, PITCH_MODULATION));
        list.add(new Pedal("Digital Space D",       "DC-3",     R.drawable.dc_3,    R.drawable.dc_3_small, 1988, 1992,  0,  CHORUS, PITCH_MODULATION));
        list.add(new Pedal("SUPER Chorus (a/d)",    "CH-1",     R.drawable.ch_1,    R.drawable.ch_1_small, 1989, 0,     0,  CHORUS, PITCH_MODULATION));
        list.add(new Pedal("Enhancer",              "EH-2",     R.drawable.eh_2,    R.drawable.eh_2_small, 1990, 1998,  0,  OTHERS));
        list.add(new Pedal("Bass Limiter",          "LM-2B",    R.drawable.lmb_2,   R.drawable.lmb_2_small,1990, 1994,  0,  BASS_PEDALS, DYNAMICS_FILTER));
        list.add(new Pedal("Tremolo/Pan",           "PN-2",     R.drawable.pn_2,    R.drawable.pn_2_small, 1990, 1993,  0,  PITCH_MODULATION));
        list.add(new Pedal("Overdrive/Distortion",  "OS-2",     R.drawable.os_2,    R.drawable.os_2_small, 1990, 0,     0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Metal Zone",            "MT-2",     R.drawable.mt_2,    R.drawable.mt_2_small, 1991, 0,     0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Parametric Equalizer",  "PQ-4",     R.drawable.pq_4,    R.drawable.pq_4_small, 1991, 1996,  0,  DYNAMICS_FILTER));
        list.add(new Pedal("Bass Parametric Equalizer", "PQ-3B",R.drawable.pqb_3,   R.drawable.pqb_3_small,1991, 1994,  0,  BASS_PEDALS, DYNAMICS_FILTER));
        list.add(new Pedal("Auto Wah",              "AW-2",     R.drawable.aw_2,    R.drawable.aw_2_small, 1991, 1999,  0,  DYNAMICS_FILTER));
        list.add(new Pedal("Chorus Ensemble (a/d)", "CE-5",     R.drawable.ce_5,    R.drawable.ce_5_small, 1991, 0,     0,  CHORUS, PITCH_MODULATION));
        list.add(new Pedal("Line Selector",         "LS-2",     R.drawable.ls_2,    R.drawable.ls_2_small, 1991, 0,     0,  OTHERS));
        list.add(new Pedal("HYPER Fuzz",            "FZ-2",     R.drawable.fz_2,    R.drawable.fz_2_small, 1993, 1997,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("DUAL Overdrive",        "SD-2",     R.drawable.sd_2,    R.drawable.sd_2_small, 1993, 1998,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("HYPER Metal",           "HM-3",     R.drawable.hm_3,    R.drawable.hm_3_small, 1993, 1999,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Digital Reverb/Delay",  "RV-3",     R.drawable.rv_3,    R.drawable.rv_3_small, 1994, 2002,  0,  DELAY_REVERB));
        list.add(new Pedal("Digital Pitch Shifter/Delay", "PS-3", R.drawable.ps_3,  R.drawable.ps_3_small, 1994, 1999,  0,  DELAY_REVERB, PITCH_MODULATION));
        list.add(new Pedal("TURBO OverDrive",       "OD-2R",    R.drawable.odr_2,   R.drawable.odr_2_small,1994, 1999,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Bass OverDrive",        "ODB-3",    R.drawable.odb_3,   R.drawable.odb_3_small,1994, 0,     0,  BASS_PEDALS, DISTORTION_OVERDRIVE));
        list.add(new Pedal("Harmonist",             "HR-2",     R.drawable.hr_2,    R.drawable.hr_2_small, 1994, 1999,  0,  PITCH_MODULATION));
        list.add(new Pedal("Bass Chorus",           "CEB-3",    R.drawable.ceb_3,   R.drawable.ceb_3_small,1995, 0,     0,  CHORUS, BASS_PEDALS, PITCH_MODULATION));
        list.add(new Pedal("Bass Limiter Enhancer", "LMB-3",    R.drawable.lmb_3,   R.drawable.lmb_3_small,1995, 0,     0,  BASS_PEDALS, DYNAMICS_FILTER));
        list.add(new Pedal("Bass Equalizer",        "GEB-7",    R.drawable.geb_7,   R.drawable.geb_7_small,1995, 0,     0,  BASS_PEDALS, DYNAMICS_FILTER));
        list.add(new Pedal("Blues Driver",          "BD-2",     R.drawable.bd_2,    R.drawable.bd_2_small, 1995, 0,     0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Digital Delay",         "DD-5",     R.drawable.dd_5,    R.drawable.dd_5_small, 1995, 2002,  0,  DELAY_REVERB));
        list.add(new Pedal("Power Driver",          "PW-2",     R.drawable.pw_2,    R.drawable.pw_2_small, 1996, 1997,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Bass Synthesizer",      "SYB-3",    R.drawable.syb_3,   R.drawable.syb_3_small,1996, 2004,  0,  OTHERS));
        list.add(new Pedal("Xtortion",              "XT-2",     R.drawable.xt_2,    R.drawable.xt_2_small, 1996, 1998,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Fuzz",                  "FZ-3",     R.drawable.fz_3,    R.drawable.fz_3_small, 1997, 1999,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Acoustic Simulator",    "AC-2",     R.drawable.ac_2,    R.drawable.ac_2_small, 1997, 2005,  0,  ACOUSTIC));
        list.add(new Pedal("Tremolo",               "TR-2",     R.drawable.tr_2,    R.drawable.tr_2_small, 1997, 0,     0,  PITCH_MODULATION));
        list.add(new Pedal("OverDrive",             "OD-3",     R.drawable.od_3,    R.drawable.od_3_small, 1997, 0,     0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Chromatic Tuner",       "TU-2",     R.drawable.tu_2,    R.drawable.tu_2_small, 1998, 2010,  0,  OTHERS));
        list.add(new Pedal("SUPER Shifter",         "PS-5",     R.drawable.ps_5,    R.drawable.ps_5_small, 1999, 2010,  0,  PITCH_MODULATION));
        list.add(new Pedal("Phase Shifter",         "PH-3",     R.drawable.ph_3,    R.drawable.ph_3_small, 2000, 0,     0,  PITCH_MODULATION));
        list.add(new Pedal("Dynamic Wah",           "AW-3",     R.drawable.aw_3,    R.drawable.aw_3_small, 2000, 0,     0,  DYNAMICS_FILTER));
        list.add(new Pedal("Mega Distortion",       "MD-2",     R.drawable.md_2,    R.drawable.md_2_small, 2001, 0,     0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Flanger",               "BF-3",     R.drawable.bf_3,    R.drawable.bf_3_small, 2002, 0,     0,  PITCH_MODULATION));
        list.add(new Pedal("Digital Delay",         "DD-6",     R.drawable.dd_6,    R.drawable.dd_6_small, 2002, 2008,  0,  DELAY_REVERB));
        list.add(new Pedal("Digital Reverb",        "RV-5",     R.drawable.rv_5,    R.drawable.rv_5_small, 2002, 2015,  0,  DELAY_REVERB));
        list.add(new Pedal("Super Octave",          "OC-3",     R.drawable.oc_3,    R.drawable.oc_3_small, 2003, 0,     0,  PITCH_MODULATION));
        list.add(new Pedal("Bass Synthesizer",      "SYB-5",    R.drawable.syb_5,   R.drawable.syb_5_small,2004, 0,     0,  OTHERS));
        list.add(new Pedal("Acoustic Simulator",    "AC-3",     R.drawable.ac_3,    R.drawable.ac_3_small, 2005, 0,     0,  ACOUSTIC));
        list.add(new Pedal("Loop Station",          "RC-2",     R.drawable.rc_2,    R.drawable.rc_2_small, 2006, 2011,  0,  OTHERS));
        list.add(new Pedal("Metal Core",            "ML-2",     R.drawable.ml_2,    R.drawable.ml_2_small, 2007, 0,     0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Fuzz",                  "FZ-5",     R.drawable.fz_5,    R.drawable.fz_5_small, 2007, 0,     0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Dyna Drive",            "DN-2",     R.drawable.dn_2,    R.drawable.dn_2_small, 2007, 2012,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Fender Bass Man",       "FBM-1",    R.drawable.fbm_1,   R.drawable.fbm_1_small,2007, 2013,  0,  BASS_PEDALS, AMP_EMULATOR));
        list.add(new Pedal("Fender Deluxe Reverb",  "FDR-1",    R.drawable.fdr_1,   R.drawable.fdr_1_small,2007, 2013,  0,  AMP_EMULATOR));
        list.add(new Pedal("Digital Delay",         "DD-7",     R.drawable.dd_7,    R.drawable.dd_7_small, 2008, 0,     0,  DELAY_REVERB));
        list.add(new Pedal("Chromatic Tuner",       "TU-3",     R.drawable.tu_3,    R.drawable.tu_3_small, 2009, 0,     0,  OTHERS));
        list.add(new Pedal("Fender Reverb",         "FRV-1",    R.drawable.frv_1,   R.drawable.frv_1_small,2009, 0,     0,  AMP_EMULATOR));
        list.add(new Pedal("Harmonist",             "PS-6",     R.drawable.ps_6,    R.drawable.ps_6_small, 2010, 0,     0,  PITCH_MODULATION));
        list.add(new Pedal("Power Stack",           "ST-2",     R.drawable.st_2,    R.drawable.st_2_small, 2010, 0,     0,  AMP_EMULATOR));
        list.add(new Pedal("Loop Station",          "RC-3",     R.drawable.rc_3,    R.drawable.rc_3_small, 2011, 0,     0,  OTHERS));
        list.add(new Pedal("Combo Drive",           "BC-2",     R.drawable.bc_2,    R.drawable.bc_2_small, 2011, 0,     0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Feedbacker/Booster",    "FB-2",     R.drawable.fb_2,    R.drawable.fb_2_small, 2011, 2015,  0,  DYNAMICS_FILTER));
        list.add(new Pedal("Tera Echo",             "TE-2",     R.drawable.te_2,    R.drawable.te_2_small, 2013, 0,     0,  DELAY_REVERB));
        list.add(new Pedal("Adaptive Distortion",   "DA-2",     R.drawable.da_2,    R.drawable.da_2_small, 2013, 2014,  0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Multi Overtone",        "MO-2",     R.drawable.mo_2,    R.drawable.mo_2_small, 2013, 0,     0,  PITCH_MODULATION));
        list.add(new Pedal("OverDrive",             "OD-1X",    R.drawable.odx_1,   R.drawable.odx_1_small,2014, 0,     R.string.od_1x,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Distortion",            "DS-1X",    R.drawable.dsx_1,   R.drawable.dsx_1_small,2014, 0,     0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Blues Driver",          "BD-2W",    R.drawable.bdw_2,   R.drawable.bdw_2_small,2014, 0,     R.string.bd_2w,  DISTORTION_OVERDRIVE, WAZA_CRAFT));
        list.add(new Pedal("SUPER OverDrive",       "SD-1W",    R.drawable.sdw_1,   R.drawable.sdw_1_small,2014, 0,     R.string.sd_1w,  DISTORTION_OVERDRIVE, WAZA_CRAFT));
        list.add(new Pedal("Loop Station",          "RC-1",     R.drawable.rc_1,    R.drawable.rc_1_small, 2014, 0,     0,  OTHERS));
        list.add(new Pedal("Delay",                 "DM-2W",    R.drawable.dmw_2,   R.drawable.dmw_2_small,2015, 0,     0,  WAZA_CRAFT, DELAY_REVERB));
        list.add(new Pedal("Bass Driver",           "BB-1X",    R.drawable.bbx_1,   R.drawable.bbx_1_small,2015, 0,     0,  BASS_PEDALS));
        list.add(new Pedal("Reverb",                "RV-6",     R.drawable.rv_6,    R.drawable.rv_6_small, 2015, 0,     0,  DELAY_REVERB));
        list.add(new Pedal("Vocoder",               "VO-1",     R.drawable.vo_1,    R.drawable.vo_1_small, 2016, 0,     0,  OTHERS));
        list.add(new Pedal("Vibrato",               "VB-2W",    R.drawable.vbw_2,   R.drawable.vbw_2_small,2016, 0,     0,  PITCH_MODULATION, WAZA_CRAFT));
        list.add(new Pedal("Bass Comp",             "BC-1X",    R.drawable.bcx_1,   R.drawable.bcx_1_small,2016, 0,     0,  BASS_PEDALS, DYNAMICS_FILTER));
        list.add(new Pedal("Chromatic Tuner",       "TU-3S",    R.drawable.tus_3,   R.drawable.tus_3_small,2016, 0,     0,  OTHERS));
        list.add(new Pedal("Chromatic Tuner",       "TU-3W",    R.drawable.tuw_3,   R.drawable.tuw_3_small,2016, 0,     0,  OTHERS, WAZA_CRAFT));
        list.add(new Pedal("Chorus",                "CE-2W",    R.drawable.ce_2w,   R.drawable.ce_2w_small,2016, 0,     0,  CHORUS, WAZA_CRAFT, PITCH_MODULATION));
        list.add(new Pedal("Acoustic Preamp",       "AD-2",     R.drawable.ad_2,    R.drawable.ad_2_small, 2016, 0,     0,  ACOUSTIC));
        list.add(new Pedal("Compressor",            "CP-1X",    R.drawable.cpx_1,   R.drawable.cpx_1_small,2016, 0,     0,  DYNAMICS_FILTER));
        list.add(new Pedal("Distortion",            "DS-1, 4A", R.drawable.dsa_1,   R.drawable.dsa_1_small,2017, -2,    0,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Angry Driver",          "JB-2",     R.drawable.jb_1,    R.drawable.jb_1_small, 2017, 0,     R.string.jb_2,  DISTORTION_OVERDRIVE));
        list.add(new Pedal("Metal Zone",            "MT-2W",    R.drawable.mt_2w,   R.drawable.mt_2w_small,-1, 0,       R.string.mt_2w,  DISTORTION_OVERDRIVE, WAZA_CRAFT));
        list.add(new Pedal("Digital Delay",         "DD-8",     R.drawable.dd_8,    R.drawable.dd_8_small, -1, 0,       0,  DELAY_REVERB));
        list.add(new Pedal("Digital Delay",         "DD-3T",    R.drawable.dd_3t,   R.drawable.dd_3t_small,-1, 0,       0,  DELAY_REVERB));
        list.add(new Pedal("Dimension C",           "DC-2W",    R.drawable.dc_2w,   R.drawable.dc_2w_small,-1, 0,       0,  CHORUS, PITCH_MODULATION, WAZA_CRAFT));
        list.add(new Pedal("Synthesizer",           "SY-1",     R.drawable.sy_1,    R.drawable.sy_1_small, -1, 0,       0,  OTHERS));
        list.add(new Pedal("Octaver",               "OC-5",     R.drawable.oc_5,    R.drawable.oc_5_small, -1, 0,       0,  PITCH_MODULATION));
        list.add(new Pedal("Loop Station",          "RC-5",     R.drawable.rc_5,    R.drawable.rc_5_small, -1, 0,       0,  OTHERS));
        list.add(new Pedal("Tone Bender",           "TB-2W",    R.drawable.tb_2w,   R.drawable.tb_2w_small, 2021, 0,    R.string.tb_2w,  DISTORTION_OVERDRIVE, WAZA_CRAFT));
        //20 Series
        list.add(new Pedal("Chorus Ensemble",       "CE-20",    R.drawable.ce_20,   R.drawable.ce_20_small, -1, -1,      R.string.ce_20, SERIES_20, CHORUS, PITCH_MODULATION));
        list.add(new Pedal("Giga Delay",            "DD-20",    R.drawable.dd_20,   R.drawable.dd_20_small, -1, -1,      0, SERIES_20, DELAY_REVERB));
        list.add(new Pedal("Advanced EQ",           "EQ-20",    R.drawable.eq_20,   R.drawable.eq_20_small, -1, -1,      0, SERIES_20, DYNAMICS_FILTER));
        list.add(new Pedal("Amp Factory",           "GP-20",    R.drawable.gp_20,   R.drawable.gp_20_small, -1, -1,      0, SERIES_20, AMP_EMULATOR));
        list.add(new Pedal("Poly Octave",           "OC-20G",   R.drawable.oc_20g,  R.drawable.oc_20g_small,-1, -1,      R.string.oc_20g, SERIES_20, PITCH_MODULATION));
        list.add(new Pedal("Drive Zone",            "OD-20",    R.drawable.od_20,   R.drawable.od_20_small, -1, -1,      0, SERIES_20, DISTORTION_OVERDRIVE));
        list.add(new Pedal("Loop Station",          "RC-20",    R.drawable.rc_20,   R.drawable.rc_20_small, -1, -1,      0, SERIES_20, OTHERS));
        list.add(new Pedal("Loop Station",          "RC-20XL",  R.drawable.rc_20xl, R.drawable.rc_20xl_small,-1,-1,      0, SERIES_20, OTHERS));
        list.add(new Pedal("Loop Station",          "RC-30",    R.drawable.rc_30,   R.drawable.rc_30_small, -1, 0,      0, SERIES_20, OTHERS));
        list.add(new Pedal("Space Echo",            "RE-20",    R.drawable.re_20,   R.drawable.re_20_small, -1, 0,      0, SERIES_20, DELAY_REVERB));
        list.add(new Pedal("Rotary Ensemble",       "RT-20",    R.drawable.rt_20,   R.drawable.rt_20_small, -1, 0,      R.string.rt_20, SERIES_20, PITCH_MODULATION));
        list.add(new Pedal("Slicer",                "SL-20",    R.drawable.sl_20,   R.drawable.sl_20_small, -1, 0,      0, SERIES_20, OTHERS));
        list.add(new Pedal("Vocal Performer",       "VE-20",    R.drawable.ve_20,   R.drawable.ve_20_small, -1, 0,      0, SERIES_20, OTHERS));
        list.add(new Pedal("Wave Processor",        "WP-20G",   R.drawable.wp20g,   R.drawable.wp20g_small, -1, -1,      0, SERIES_20, OTHERS));
        list.add(new Pedal("V-Guitar Distortion",   "GR-D",     R.drawable.gr_d,    R.drawable.gr_d_small,  -1, -1,      0, SERIES_20, OTHERS));
        list.add(new Pedal("V-Guitar Space",        "GR-S",     R.drawable.gr_s,    R.drawable.gr_s_small,  -1, -1,      0, SERIES_20, OTHERS));

        return list;
    }

    public Pedal getPedal(int position) {
        return Objects.requireNonNull(pedalList.getValue()).get(position);
    }

}

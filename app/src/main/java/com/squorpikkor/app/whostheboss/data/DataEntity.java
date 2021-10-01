package com.squorpikkor.app.whostheboss.data;

import static com.squorpikkor.app.whostheboss.Device.ACOUSTIC;
import static com.squorpikkor.app.whostheboss.Device.AMP_EMULATOR;
import static com.squorpikkor.app.whostheboss.Device.BASS_PEDALS;
import static com.squorpikkor.app.whostheboss.Device.CHORUS;
import static com.squorpikkor.app.whostheboss.Device.DELAY_REVERB;
import static com.squorpikkor.app.whostheboss.Device.DISTORTION_OVERDRIVE;
import static com.squorpikkor.app.whostheboss.Device.DYNAMICS_FILTER;
import static com.squorpikkor.app.whostheboss.Device.OTHERS;
import static com.squorpikkor.app.whostheboss.Device.PITCH_MODULATION;
import static com.squorpikkor.app.whostheboss.Device.SERIES_10;
import static com.squorpikkor.app.whostheboss.Device.SERIES_20;
import static com.squorpikkor.app.whostheboss.Device.WAZA_CRAFT;
import static com.squorpikkor.app.whostheboss.Utils.convert;

import android.util.Log;

import com.squorpikkor.app.whostheboss.Device;
import com.squorpikkor.app.whostheboss.R;
import com.squorpikkor.app.whostheboss.Utils;

import java.util.ArrayList;

public class DataEntity {

    /*public static Device[] getAll() {
        return new Device[]{
                new Device("Over Drive",        "OD-1",     1977,   1988,   DISTORTION_OVERDRIVE),
                new Device("Spectrum",          "SP-1",     1977,   1981,   PITCH_MODULATION),
                new Device("Phaser",            "PH-1",     1977,   1981,   PITCH_MODULATION),
                new Device("Chorus Ensemble",   "CE-20",    0,      0,      convert(SERIES_20, CHORUS, PITCH_MODULATION))
        };
    }*/

    public static Device[] getAll() {
        return new Device[]{
                new Device("Over Drive",        "OD-1",     "1977-1988",    DISTORTION_OVERDRIVE),
                new Device("Spectrum",          "SP-1",     "1977-1981",    PITCH_MODULATION),
                new Device("Phaser",            "PH-1",     "1977-1981",    PITCH_MODULATION),
                new Device("Chorus Ensemble",   "CE-20",    "?",            convert(SERIES_20, CHORUS, PITCH_MODULATION))
        };
    }

    /*static Device[] getAll() {
        return new Device[]{
        new Device("Over Drive", "OD-1", R.drawable.od_1, R.drawable.od_1_small, 1977, 1988, 0, 0, DISTORTION_OVERDRIVE),
        new Device("Spectrum", "SP-1", R.drawable.sp_1, R.drawable.sp_1_small, 1977, 1981, 0, 0, PITCH_MODULATION),
        new Device("Phaser", "PH-1", R.drawable.ph_1, R.drawable.ph_1_small, 1977, 1981, 0, PITCH_MODULATION),
        new Device("Graphic Equalizer", "GE-6", R.drawable.ge_6, R.drawable.ge_6_small, 1978, 1981, 0, DYNAMICS_FILTER),
        new Device("T-Wah", "TW-1", R.drawable.tw_1, R.drawable.tw_1_small, 1978, 1988, 0, DYNAMICS_FILTER),
        new Device("Touch Wah", "TW-1", R.drawable.tow_1, R.drawable.tow_1_small, 1978, 1988, 0, DYNAMICS_FILTER),
        new Device("Distortion", "DS-1", R.drawable.ds_1, R.drawable.ds_1_small, 1978, 0, R.string.ds_1, DISTORTION_OVERDRIVE),
        new Device("Compression Sustainer", "CS-1", R.drawable.cs_1, R.drawable.cs_1_small, 1978, 1982, 0, DYNAMICS_FILTER),
        new Device("Noise Gate", "NF-1", R.drawable.nf_1, R.drawable.nf_1_small, 1979, 1982, 0, OTHERS),
        new Device("Slow Gear", "SG-1", R.drawable.sg_1, R.drawable.sg_1_small, 1979, 1982, 0, DYNAMICS_FILTER),
        new Device("Chorus", "CE-2", R.drawable.ce_2, R.drawable.ce_2_small, 1979, 1991, 0, CHORUS, PITCH_MODULATION),
        new Device("Flanger", "BF-2", R.drawable.bf_2, R.drawable.bf_2_small, 1980, 2001, 0, PITCH_MODULATION),
        new Device("Phaser", "PH-1R", R.drawable.ph_1r, R.drawable.ph_1r_small, 1980, 1985, 0, PITCH_MODULATION),
        new Device("SUPER OverDrive", "SD-1", R.drawable.sd_1, R.drawable.sd_1_small, 1981, 0, R.string.sd_1, DISTORTION_OVERDRIVE),
        new Device("Delay", "DM-2", R.drawable.dm_2, R.drawable.dm_2_small, 1981, 1984, 0, DELAY_REVERB),
        new Device("Graphic Equalizer", "GE-7", R.drawable.ge_7, R.drawable.ge_7_small, 1981, 0, 0, DYNAMICS_FILTER),
        new Device("Compression Sustainer", "CS-2", R.drawable.cs_2, R.drawable.cs_2_small, 1981, 1988, 0, DYNAMICS_FILTER),
        new Device("Vibrato", "VB-2", R.drawable.vb_2, R.drawable.vb_2_small, 1982, 1984, 0, PITCH_MODULATION),
        new Device("Octaver", "OC-2", R.drawable.oc_2, R.drawable.oc_2_small, 1982, 1984, 0, PITCH_MODULATION),
        new Device("Octave", "OC-2", R.drawable.oc_2, R.drawable.oc_2_small, 1984, 2003, 0, PITCH_MODULATION),
        new Device("Power Supply & Master Switch", "PSM-5", R.drawable.psm_5, R.drawable.psm_5_small, 1982, 1999, 0, OTHERS),
        new Device("Chorus", "CE-3", R.drawable.ce_3, R.drawable.ce_3_small, 1982, 1989, 0, CHORUS, PITCH_MODULATION),
        new Device("Heavy Metal", "HM-2", R.drawable.hm_2, R.drawable.hm_2_small, 1983, 1992, 0, DISTORTION_OVERDRIVE),
        new Device("Digital Delay", "DD-2", R.drawable.dd_2, R.drawable.dd_2_small, 1984, 1986, 0, DELAY_REVERB),
        new Device("Delay", "DM-3", R.drawable.dm_3, R.drawable.dm_3_small, 1984, 1987, 0, DELAY_REVERB),
        new Device("SUPER Feedbacker & Distortion", "DF-2", R.drawable.df_2, R.drawable.df_2_small, 1984, 1993, 0, DISTORTION_OVERDRIVE),
        new Device("SUPER Phaser", "PH-2", R.drawable.ph_2, R.drawable.ph_2_small, 1984, 2000, 0, PITCH_MODULATION),
        new Device("Digital Sampler/Delay", "DSD-2", R.drawable.dsd_2, R.drawable.dsd_2_small, 1985, 1986, 0, DELAY_REVERB),
        new Device("TURBO OverDrive", "OD-2", R.drawable.od_2, R.drawable.od_2_small, 1985, 1994, 0, DISTORTION_OVERDRIVE),
        new Device("Hi Band Flanger", "HF-2", R.drawable.hf_2, R.drawable.hf_2_small, 1985, 1993, 0, PITCH_MODULATION),
        new Device("Dimension C", "DC-2", R.drawable.dc_2, R.drawable.dc_2_small, 1985, 1988, 0, CHORUS, PITCH_MODULATION),
        new Device("Digital Sampler/Delay", "DSD-3", R.drawable.dsd_3, R.drawable.dsd_3_small, 1986, 1989, 0, DELAY_REVERB),
        new Device("Compression Sustainer", "CS-3", R.drawable.cs_3, R.drawable.cs_3_small, 1986, 0, 0, DYNAMICS_FILTER),
        new Device("Digital Delay", "DD-3", R.drawable.dd_3, R.drawable.dd_3_small, 1986, 2019, 0, DELAY_REVERB),
        new Device("Dynamic Filter", "FT-2", R.drawable.ft_2, R.drawable.ft_2_small, 1986, 1989, 0, DYNAMICS_FILTER),
        new Device("Bass Chorus", "CE-2B", R.drawable.ceb_2, R.drawable.ceb_2_small, 1987, 1994, 0, CHORUS, BASS_PEDALS, PITCH_MODULATION),
        new Device("Bass Flanger", "BF-2B", R.drawable.bfb_2, R.drawable.bfb_2_small, 1987, 1993, 0, BASS_PEDALS, PITCH_MODULATION),
        new Device("Bass Equalizer", "GE-7B", R.drawable.ge_7b, R.drawable.ge_7b_small, 1987, 1994, 0, BASS_PEDALS, DYNAMICS_FILTER),
        new Device("Turbo Distortion", "DS-2", R.drawable.ds_2, R.drawable.ds_2_small, 1987, 0, R.string.ds_2, DISTORTION_OVERDRIVE),
        new Device("Limiter", "LM-2", R.drawable.lm_2, R.drawable.lm_2_small, 1987, 1991, 0, DYNAMICS_FILTER),
        new Device("Digital Reverb", "RV-2", R.drawable.rv_2, R.drawable.rv_2_small, 1987, 1989, 0, DELAY_REVERB),
        new Device("Noise Suppressor", "NS-2", R.drawable.ns_2, R.drawable.ns_2_small, 1987, 0, 0, OTHERS),
        new Device("Digital Pitch Shifter", "PS-2", R.drawable.ps_2, R.drawable.ps_2_small, 1987, 1993, 0, PITCH_MODULATION),
        new Device("Digital Metalizer", "MZ-2", R.drawable.mz_2, R.drawable.mz_2_small, 1987, 1992, 0, CHORUS, DISTORTION_OVERDRIVE, DELAY_REVERB, PITCH_MODULATION),
        new Device("Digital Dimension", "DC-3", R.drawable.dcc_3, R.drawable.dcc_3_small, 1988, 1993, 0, CHORUS, PITCH_MODULATION),
        new Device("Digital Space D", "DC-3", R.drawable.dc_3, R.drawable.dc_3_small, 1989, 1992, 0, CHORUS, PITCH_MODULATION),
        new Device("SUPER Chorus (analog)", "CH-1", R.drawable.ch_1, R.drawable.ch_1_small, 1989, 2001, 0, CHORUS, PITCH_MODULATION),
        new Device("SUPER Chorus (digital)", "CH-1", R.drawable.ch_1, R.drawable.ch_1_small, 2001, 0, 0, CHORUS, PITCH_MODULATION),
        new Device("Enhancer", "EH-2", R.drawable.eh_2, R.drawable.eh_2_small, 1990, 1998, 0, OTHERS),
        new Device("Bass Limiter", "LM-2B", R.drawable.lmb_2, R.drawable.lmb_2_small, 1990, 1994, 0, BASS_PEDALS, DYNAMICS_FILTER),
        new Device("Tremolo/Pan", "PN-2", R.drawable.pn_2, R.drawable.pn_2_small, 1990, 1993, 0, PITCH_MODULATION),
        new Device("Overdrive/Distortion", "OS-2", R.drawable.os_2, R.drawable.os_2_small, 1990, 0, R.string.os_2, DISTORTION_OVERDRIVE),
        new Device("Metal Zone", "MT-2", R.drawable.mt_2, R.drawable.mt_2_small, 1991, 0, R.string.mt_2, DISTORTION_OVERDRIVE),
        new Device("Parametric Equalizer", "PQ-4", R.drawable.pq_4, R.drawable.pq_4_small, 1991, 1996, 0, DYNAMICS_FILTER),
        new Device("Bass Parametric Equalizer", "PQ-3B", R.drawable.pqb_3, R.drawable.pqb_3_small, 1991, 1994, 0, BASS_PEDALS, DYNAMICS_FILTER),
        new Device("Auto Wah", "AW-2", R.drawable.aw_2, R.drawable.aw_2_small, 1991, 1999, 0, DYNAMICS_FILTER),
        new Device("Chorus Ensemble (analog)", "CE-5", R.drawable.ce_5, R.drawable.ce_5_small, 1991, 2001, 0, CHORUS, PITCH_MODULATION),
        new Device("Chorus Ensemble (digital)", "CE-5", R.drawable.ce_5, R.drawable.ce_5_small, 2001, 0, 0, CHORUS, PITCH_MODULATION),
        new Device("Line Selector", "LS-2", R.drawable.ls_2, R.drawable.ls_2_small, 1991, 0, 0, OTHERS),
        new Device("HYPER Fuzz", "FZ-2", R.drawable.fz_2, R.drawable.fz_2_small, 1993, 1997, 0, DISTORTION_OVERDRIVE),
        new Device("DUAL Overdrive", "SD-2", R.drawable.sd_2, R.drawable.sd_2_small, 1993, 1998, 0, DISTORTION_OVERDRIVE),
        new Device("HYPER Metal", "HM-3", R.drawable.hm_3, R.drawable.hm_3_small, 1993, 1999, 0, DISTORTION_OVERDRIVE),
        new Device("Digital Reverb/Delay", "RV-3", R.drawable.rv_3, R.drawable.rv_3_small, 1994, 2002, 0, DELAY_REVERB),
        new Device("Digital Pitch Shifter/Delay", "PS-3", R.drawable.ps_3, R.drawable.ps_3_small, 1994, 1999, 0, DELAY_REVERB, PITCH_MODULATION),
        new Device("TURBO OverDrive", "OD-2R", R.drawable.odr_2, R.drawable.odr_2_small, 1994, 1999, 0, DISTORTION_OVERDRIVE),
        new Device("Bass OverDrive", "ODB-3", R.drawable.odb_3, R.drawable.odb_3_small, 1994, 0, 0, BASS_PEDALS, DISTORTION_OVERDRIVE),
        new Device("Harmonist", "HR-2", R.drawable.hr_2, R.drawable.hr_2_small, 1994, 1999, 0, PITCH_MODULATION),
        new Device("Bass Chorus (analog)", "CEB-3", R.drawable.ceb_3, R.drawable.ceb_3_small, 1995, 2001, 0, CHORUS, BASS_PEDALS, PITCH_MODULATION),
        new Device("Bass Chorus (digital)", "CEB-3", R.drawable.ceb_3, R.drawable.ceb_3_small, 2001, 0, 0, CHORUS, BASS_PEDALS, PITCH_MODULATION),
        new Device("Bass Limiter Enhancer", "LMB-3", R.drawable.lmb_3, R.drawable.lmb_3_small, 1995, 0, 0, BASS_PEDALS, DYNAMICS_FILTER),
        new Device("Bass Equalizer", "GEB-7", R.drawable.geb_7, R.drawable.geb_7_small, 1995, 0, 0, BASS_PEDALS, DYNAMICS_FILTER),
        new Device("Blues Driver", "BD-2", R.drawable.bd_2, R.drawable.bd_2_small, 1995, 0, R.string.bd_2, DISTORTION_OVERDRIVE),
        new Device("Digital Delay", "DD-5", R.drawable.dd_5, R.drawable.dd_5_small, 1995, 2002, 0, DELAY_REVERB),
        new Device("Power Driver", "PW-2", R.drawable.pw_2, R.drawable.pw_2_small, 1996, 1997, 0, DISTORTION_OVERDRIVE),
        new Device("Bass Synthesizer", "SYB-3", R.drawable.syb_3, R.drawable.syb_3_small, 1996, 2004, 0, OTHERS),
        new Device("Xtortion", "XT-2", R.drawable.xt_2, R.drawable.xt_2_small, 1996, 1998, 0, DISTORTION_OVERDRIVE),
        new Device("Fuzz", "FZ-3", R.drawable.fz_3, R.drawable.fz_3_small, 1997, 1999, 0, DISTORTION_OVERDRIVE),
        new Device("Acoustic Simulator", "AC-2", R.drawable.ac_2, R.drawable.ac_2_small, 1997, 2005, 0, ACOUSTIC),
        new Device("Tremolo", "TR-2", R.drawable.tr_2, R.drawable.tr_2_small, 1997, 0, 0, PITCH_MODULATION),
        new Device("OverDrive", "OD-3", R.drawable.od_3, R.drawable.od_3_small, 1997, 0, R.string.od_3, DISTORTION_OVERDRIVE),
        new Device("Chromatic Tuner", "TU-2", R.drawable.tu_2, R.drawable.tu_2_small, 1998, 2010, 0, OTHERS),
        new Device("SUPER Shifter", "PS-5", R.drawable.ps_5, R.drawable.ps_5_small, 1999, 2010, 0, PITCH_MODULATION),
        new Device("Phase Shifter", "PH-3", R.drawable.ph_3, R.drawable.ph_3_small, 2000, 0, 0, PITCH_MODULATION),
        new Device("Dynamic Wah", "AW-3", R.drawable.aw_3, R.drawable.aw_3_small, 2000, 0, 0, DYNAMICS_FILTER),
        new Device("Mega Distortion", "MD-2", R.drawable.md_2, R.drawable.md_2_small, 2001, 0, R.string.md_2, 0, DISTORTION_OVERDRIVE),
        new Device("Flanger", "BF-3", R.drawable.bf_3, R.drawable.bf_3_small, 2002, 0, 0, PITCH_MODULATION),
        new Device("Digital Delay", "DD-6", R.drawable.dd_6, R.drawable.dd_6_small, 2002, 2008, 0, DELAY_REVERB),
        new Device("Digital Reverb", "RV-5", R.drawable.rv_5, R.drawable.rv_5_small, 2002, 2015, 0, DELAY_REVERB),
        new Device("Super Octave", "OC-3", R.drawable.oc_3, R.drawable.oc_3_small, 2003, 0, 0, PITCH_MODULATION),
        new Device("Bass Synthesizer", "SYB-5", R.drawable.syb_5, R.drawable.syb_5_small, 2004, 0, 0, OTHERS),
        new Device("Acoustic Simulator", "AC-3", R.drawable.ac_3, R.drawable.ac_3_small, 2005, 0, 0, ACOUSTIC),
        new Device("Loop Station", "RC-2", R.drawable.rc_2, R.drawable.rc_2_small, 2006, 2011, 0, OTHERS),
        new Device("Metal Core", "ML-2", R.drawable.ml_2, R.drawable.ml_2_small, 2007, 0, R.string.ml_2, DISTORTION_OVERDRIVE),
        new Device("Fuzz", "FZ-5", R.drawable.fz_5, R.drawable.fz_5_small, 2007, 0, R.string.fz_5, 0, DISTORTION_OVERDRIVE),
        new Device("Dyna Drive", "DN-2", R.drawable.dn_2, R.drawable.dn_2_small, 2007, 2012, 0, DISTORTION_OVERDRIVE),
        new Device("Fender Bass Man", "FBM-1", R.drawable.fbm_1, R.drawable.fbm_1_small, 2007, 2013, 0, BASS_PEDALS, AMP_EMULATOR),
        new Device("Fender Deluxe Reverb", "FDR-1", R.drawable.fdr_1, R.drawable.fdr_1_small, 2007, 2013, 0, AMP_EMULATOR),
        new Device("Digital Delay", "DD-7", R.drawable.dd_7, R.drawable.dd_7_small, 2008, 0, 0, DELAY_REVERB),
        new Device("Chromatic Tuner", "TU-3", R.drawable.tu_3, R.drawable.tu_3_small, 2009, 0, 0, OTHERS),
        new Device("Fender Reverb", "FRV-1", R.drawable.frv_1, R.drawable.frv_1_small, 2009, 2019, 0, AMP_EMULATOR),
        new Device("Harmonist", "PS-6", R.drawable.ps_6, R.drawable.ps_6_small, 2010, 0, 0, PITCH_MODULATION),
        new Device("Power Stack", "ST-2", R.drawable.st_2, R.drawable.st_2_small, 2010, 0, 0, AMP_EMULATOR),
        new Device("Loop Station", "RC-3", R.drawable.rc_3, R.drawable.rc_3_small, 2011, 0, 0, OTHERS),
        new Device("Combo Drive", "BC-2", R.drawable.bc_2, R.drawable.bc_2_small, 2011, 2019, R.string.bc_2, DISTORTION_OVERDRIVE),
        new Device("Feedbacker/Booster", "FB-2", R.drawable.fb_2, R.drawable.fb_2_small, 2011, 2015, 0, DYNAMICS_FILTER),
        new Device("Tera Echo", "TE-2", R.drawable.te_2, R.drawable.te_2_small, 2013, 0, 0, DELAY_REVERB),
        new Device("Adaptive Distortion", "DA-2", R.drawable.da_2, R.drawable.da_2_small, 2013, 2014, 0, DISTORTION_OVERDRIVE),
        new Device("Multi Overtone", "MO-2", R.drawable.mo_2, R.drawable.mo_2_small, 2013, 0, 0, PITCH_MODULATION),
        new Device("OverDrive", "OD-1X", R.drawable.odx_1, R.drawable.odx_1_small, 2014, 0, R.string.od_1x, DISTORTION_OVERDRIVE),
        new Device("Distortion", "DS-1X", R.drawable.dsx_1, R.drawable.dsx_1_small, 2014, 0, R.string.ds_1x, DISTORTION_OVERDRIVE),
        new Device("Blues Driver", "BD-2W", R.drawable.bdw_2, R.drawable.bdw_2_small, 2014, 0, R.string.bd_2w, DISTORTION_OVERDRIVE, WAZA_CRAFT),
        new Device("SUPER OverDrive", "SD-1W", R.drawable.sdw_1, R.drawable.sdw_1_small, 2014, 0, R.string.sd_1w, DISTORTION_OVERDRIVE, WAZA_CRAFT),
        new Device("Loop Station", "RC-1", R.drawable.rc_1, R.drawable.rc_1_small, 2014, 0, 0, OTHERS),
        new Device("Delay", "DM-2W", R.drawable.dmw_2, R.drawable.dmw_2_small, 2015, 0, 0, WAZA_CRAFT, DELAY_REVERB),
        new Device("Bass Driver", "BB-1X", R.drawable.bbx_1, R.drawable.bbx_1_small, 2015, 0, 0, BASS_PEDALS),
        new Device("Reverb", "RV-6", R.drawable.rv_6, R.drawable.rv_6_small, 2015, 0, 0, DELAY_REVERB),
        new Device("Vocoder", "VO-1", R.drawable.vo_1, R.drawable.vo_1_small, 2016, 0, 0, OTHERS),
        new Device("Vibrato", "VB-2W", R.drawable.vbw_2, R.drawable.vbw_2_small, 2016, 0, 0, PITCH_MODULATION, WAZA_CRAFT),
        new Device("Bass Comp", "BC-1X", R.drawable.bcx_1, R.drawable.bcx_1_small, 2016, 0, 0, BASS_PEDALS, DYNAMICS_FILTER),
        new Device("Chromatic Tuner", "TU-3S", R.drawable.tus_3, R.drawable.tus_3_small, 2016, 0, 0, OTHERS),
        new Device("Chromatic Tuner", "TU-3W", R.drawable.tuw_3, R.drawable.tuw_3_small, 2016, 0, 0, OTHERS, WAZA_CRAFT),
        new Device("Chorus", "CE-2W", R.drawable.ce_2w, R.drawable.ce_2w_small, 2016, 0, 0, CHORUS, WAZA_CRAFT, PITCH_MODULATION),
        new Device("Acoustic Preamp", "AD-2", R.drawable.ad_2, R.drawable.ad_2_small, 2016, 0, 0, ACOUSTIC),
        new Device("Compressor", "CP-1X", R.drawable.cpx_1, R.drawable.cpx_1_small, 2016, 0, 0, DYNAMICS_FILTER),
        new Device("Distortion", "DS-1-4A", R.drawable.dsa_1, R.drawable.dsa_1_small, 2017, -2, 0, DISTORTION_OVERDRIVE),
        new Device("Angry Driver", "JB-2", R.drawable.jb_1, R.drawable.jb_1_small, 2017, 0, R.string.jb_2, DISTORTION_OVERDRIVE),
        new Device("Metal Zone", "MT-2W", R.drawable.mt_2w, R.drawable.mt_2w_small, 2018, 0, R.string.mt_2w, DISTORTION_OVERDRIVE, WAZA_CRAFT),
        new Device("Digital Delay", "DD-8", R.drawable.dd_8, R.drawable.dd_8_small, 2019, 0, 0, DELAY_REVERB),
        new Device("Digital Delay", "DD-3T", R.drawable.dd_3t, R.drawable.dd_3t_small, 2019, 0, 0, DELAY_REVERB),
        new Device("Dimension C", "DC-2W", R.drawable.dc_2w, R.drawable.dc_2w_small, 2018, 0, 0, CHORUS, PITCH_MODULATION, WAZA_CRAFT),
        new Device("Synthesizer", "SY-1", R.drawable.sy_1, R.drawable.sy_1_small, 2019, 0, 0, OTHERS),
        new Device("Octaver", "OC-5", R.drawable.oc_5, R.drawable.oc_5_small, 2020, 0, 0, PITCH_MODULATION),
        new Device("Loop Station", "RC-5", R.drawable.rc_5, R.drawable.rc_5_small, 2020, 0, 0, OTHERS),
        new Device("Tone Bender", "TB-2W", R.drawable.tb_2w, R.drawable.tb_2w_small, 2021, 0, R.string.tb_2w, DISTORTION_OVERDRIVE, WAZA_CRAFT),
        new Device("Heavy Metal", "HM-2W", R.drawable.hm_2w, R.drawable.hm_2w_small, 2021, 0, 0, DISTORTION_OVERDRIVE, WAZA_CRAFT),
        new Device("Metal Zone", "MT-2-3A", R.drawable.mt_2_a3, R.drawable.mt_2_a3_small, 2021, -2, 0, DISTORTION_OVERDRIVE),
        new Device("Super Overdrive", "SD-1-4A", R.drawable.sd_1_4a, R.drawable.sd_1_4a_small, 2021, -2, 0, DISTORTION_OVERDRIVE),
        //20 Series
        new Device("Chorus Ensemble", "CE-20", R.drawable.ce_20, R.drawable.ce_20_small, -1, -1, R.string.ce_20, SERIES_20, CHORUS, PITCH_MODULATION),
        new Device("Giga Delay", "DD-20", R.drawable.dd_20, R.drawable.dd_20_small, -1, -1, 0, SERIES_20, DELAY_REVERB),
        new Device("Advanced EQ", "EQ-20", R.drawable.eq_20, R.drawable.eq_20_small, -1, -1, 0, SERIES_20, DYNAMICS_FILTER),
        new Device("Amp Factory", "GP-20", R.drawable.gp_20, R.drawable.gp_20_small, -1, -1, 0, SERIES_20, AMP_EMULATOR),
        new Device("Poly Octave", "OC-20G", R.drawable.oc_20g, R.drawable.oc_20g_small, -1, -1, R.string.oc_20g, SERIES_20, PITCH_MODULATION),
        new Device("Drive Zone", "OD-20", R.drawable.od_20, R.drawable.od_20_small, -1, -1, 0, SERIES_20, DISTORTION_OVERDRIVE),
        new Device("Loop Station", "RC-20", R.drawable.rc_20, R.drawable.rc_20_small, -1, -1, 0, SERIES_20, OTHERS),
        new Device("Loop Station", "RC-20XL", R.drawable.rc_20xl, R.drawable.rc_20xl_small, -1, -1, 0, SERIES_20, OTHERS),
        new Device("Loop Station", "RC-30", R.drawable.rc_30, R.drawable.rc_30_small, -1, 0, 0, SERIES_20, OTHERS),
        new Device("Space Echo", "RE-20", R.drawable.re_20, R.drawable.re_20_small, -1, 0, 0, SERIES_20, DELAY_REVERB),
        new Device("Rotary Ensemble", "RT-20", R.drawable.rt_20, R.drawable.rt_20_small, -1, 0, R.string.rt_20, SERIES_20, PITCH_MODULATION),
        new Device("Slicer", "SL-20", R.drawable.sl_20, R.drawable.sl_20_small, -1, 0, 0, SERIES_20, OTHERS),
        new Device("Vocal Performer", "VE-20", R.drawable.ve_20, R.drawable.ve_20_small, -1, 0, 0, SERIES_20, OTHERS),
        new Device("Wave Processor", "WP-20G", R.drawable.wp20g, R.drawable.wp20g_small, -1, -1, 0, SERIES_20, OTHERS),
        new Device("V-Guitar Distortion", "GR-D", R.drawable.gr_d, R.drawable.gr_d_small, -1, -1, 0, SERIES_20, OTHERS),
        new Device("V-Guitar Space", "GR-S", R.drawable.gr_s, R.drawable.gr_s_small, -1, -1, 0, SERIES_20, OTHERS),
        //10 Series
        new Device("Compressor Limiter", "RCL-10", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rcl_10, SERIES_10, DYNAMICS_FILTER),
        new Device("Graphic Equalizer", "RGE-10", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rge_10, SERIES_10, DYNAMICS_FILTER),
        new Device("Digital Delay", "RDD-10", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rdd_10, SERIES_10, DELAY_REVERB),
        new Device("Phaser", "RPH-10", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rph_10, SERIES_10, PITCH_MODULATION),
        new Device("Flanger", "RBF-10", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rbf_10, SERIES_10, PITCH_MODULATION),
        new Device("Digital Chorus Ensemble", "RCE-10", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rce_10, SERIES_10, CHORUS, PITCH_MODULATION),
        new Device("Digital Reverb", "RRV-10", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rrv_10, SERIES_10, DELAY_REVERB),
        new Device("Overdrive / Distortion", "ROD-10", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rod_10, SERIES_10, DISTORTION_OVERDRIVE),
        new Device("Pitch Shifter / Delay", "RPS-10", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rps_10, SERIES_10, DELAY_REVERB, PITCH_MODULATION),
        new Device("Preamp / Parametric EQ", "RPQ-10", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rpq_10, SERIES_10, DYNAMICS_FILTER),
        new Device("Digital Sampler / Delay", "RSD-10", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rsd_10, SERIES_10, DELAY_REVERB),
        new Device("Panning Delay", "RPD-10", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rpd_10, SERIES_10, DELAY_REVERB),
        new Device("Power supply", "RPW-7", R.drawable.no_img, R.drawable.no_img, -1, -1, R.string.rpw_7, SERIES_10, OTHERS)
        };
    }*/

    /*static ArrayList<Device> getAllList() {
        ArrayList<Device> list = new ArrayList<>();
        list.add(new Device("Over Drive",            "OD-1",     R.drawable.od_1,    R.drawable.od_1_small, 1977, 1988,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Spectrum",              "SP-1",     R.drawable.sp_1,    R.drawable.sp_1_small, 1977, 1981,  0,  PITCH_MODULATION));
        list.add(new Device("Phaser",                "PH-1",     R.drawable.ph_1,    R.drawable.ph_1_small, 1977, 1981,  0,  PITCH_MODULATION));
        list.add(new Device("Graphic Equalizer",     "GE-6",     R.drawable.ge_6,    R.drawable.ge_6_small, 1978, 1981,  0,  DYNAMICS_FILTER));
        list.add(new Device("T-Wah",                 "TW-1",     R.drawable.tw_1,    R.drawable.tw_1_small, 1978, 1988,  0,  DYNAMICS_FILTER));
        list.add(new Device("Touch Wah",             "TW-1",     R.drawable.tow_1,   R.drawable.tow_1_small,1978, 1988,  0,  DYNAMICS_FILTER));
        list.add(new Device("Distortion",            "DS-1",     R.drawable.ds_1,    R.drawable.ds_1_small, 1978, 0,     R.string.ds_1,  DISTORTION_OVERDRIVE));
        list.add(new Device("Compression Sustainer", "CS-1",     R.drawable.cs_1,    R.drawable.cs_1_small, 1978, 1982,  0,  DYNAMICS_FILTER));
        list.add(new Device("Noise Gate",            "NF-1",     R.drawable.nf_1,    R.drawable.nf_1_small, 1979, 1982,  0,  OTHERS));
        list.add(new Device("Slow Gear",             "SG-1",     R.drawable.sg_1,    R.drawable.sg_1_small, 1979, 1982,  0,  DYNAMICS_FILTER));
        list.add(new Device("Chorus",                "CE-2",     R.drawable.ce_2,    R.drawable.ce_2_small, 1979, 1991,  0,  CHORUS, PITCH_MODULATION));
        list.add(new Device("Flanger",               "BF-2",     R.drawable.bf_2,    R.drawable.bf_2_small, 1980, 2001,  0,  PITCH_MODULATION));
        list.add(new Device("Phaser",                "PH-1R",    R.drawable.ph_1r,   R.drawable.ph_1r_small,1980, 1985,  0,  PITCH_MODULATION));
        list.add(new Device("SUPER OverDrive",       "SD-1",     R.drawable.sd_1,    R.drawable.sd_1_small, 1981, 0,     R.string.sd_1,  DISTORTION_OVERDRIVE));
        list.add(new Device("Delay",                 "DM-2",     R.drawable.dm_2,    R.drawable.dm_2_small, 1981, 1984,  0,  DELAY_REVERB));
        list.add(new Device("Graphic Equalizer",     "GE-7",     R.drawable.ge_7,    R.drawable.ge_7_small, 1981, 0,     0,  DYNAMICS_FILTER));
        list.add(new Device("Compression Sustainer", "CS-2",     R.drawable.cs_2,    R.drawable.cs_2_small, 1981, 1988,  0,  DYNAMICS_FILTER));
        list.add(new Device("Vibrato",               "VB-2",     R.drawable.vb_2,    R.drawable.vb_2_small, 1982, 1984,  0,  PITCH_MODULATION));
        list.add(new Device("Octaver",                "OC-2",     R.drawable.oc_2,    R.drawable.oc_2_small, 1982, 1984,  0,  PITCH_MODULATION));
        list.add(new Device("Octave",                "OC-2",     R.drawable.oc_2,    R.drawable.oc_2_small, 1984, 2003,  0,  PITCH_MODULATION));
        list.add(new Device("Power Supply & Master Switch", "PSM-5", R.drawable.psm_5, R.drawable.psm_5_small,1982, 1999,0,  OTHERS));
        list.add(new Device("Chorus",                "CE-3",     R.drawable.ce_3,    R.drawable.ce_3_small, 1982, 1989,  0,  CHORUS, PITCH_MODULATION));
        list.add(new Device("Heavy Metal",           "HM-2",     R.drawable.hm_2,    R.drawable.hm_2_small, 1983, 1992,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Digital Delay",         "DD-2",     R.drawable.dd_2,    R.drawable.dd_2_small, 1984, 1986,  0,  DELAY_REVERB));
        list.add(new Device("Delay",                 "DM-3",     R.drawable.dm_3,    R.drawable.dm_3_small, 1984, 1987,  0,  DELAY_REVERB));
        list.add(new Device("SUPER Feedbacker & Distortion", "DF-2", R.drawable.df_2,R.drawable.df_2_small, 1984, 1993,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("SUPER Phaser",          "PH-2",     R.drawable.ph_2,    R.drawable.ph_2_small, 1984, 2000,  0,  PITCH_MODULATION));
        list.add(new Device("Digital Sampler/Delay", "DSD-2",    R.drawable.dsd_2,   R.drawable.dsd_2_small,1985, 1986,  0,  DELAY_REVERB));
        list.add(new Device("TURBO OverDrive",       "OD-2",     R.drawable.od_2,    R.drawable.od_2_small, 1985, 1994,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Hi Band Flanger",       "HF-2",     R.drawable.hf_2,    R.drawable.hf_2_small, 1985, 1993,  0,  PITCH_MODULATION));
        list.add(new Device("Dimension C",           "DC-2",     R.drawable.dc_2,    R.drawable.dc_2_small, 1985, 1988,  0,  CHORUS, PITCH_MODULATION));
        list.add(new Device("Digital Sampler/Delay", "DSD-3",    R.drawable.dsd_3,   R.drawable.dsd_3_small,1986, 1989,  0,  DELAY_REVERB));
        list.add(new Device("Compression Sustainer", "CS-3",     R.drawable.cs_3,    R.drawable.cs_3_small, 1986, 0,     0,  DYNAMICS_FILTER));
        list.add(new Device("Digital Delay",         "DD-3",     R.drawable.dd_3,    R.drawable.dd_3_small, 1986, 2019,     0,  DELAY_REVERB));
        list.add(new Device("Dynamic Filter",        "FT-2",     R.drawable.ft_2,    R.drawable.ft_2_small, 1986, 1989,  0,  DYNAMICS_FILTER));
        list.add(new Device("Bass Chorus",           "CE-2B",    R.drawable.ceb_2,   R.drawable.ceb_2_small,1987, 1994,  0,  CHORUS, BASS_PEDALS, PITCH_MODULATION));
        list.add(new Device("Bass Flanger",          "BF-2B",    R.drawable.bfb_2,   R.drawable.bfb_2_small,1987, 1993,  0,  BASS_PEDALS, PITCH_MODULATION));
        list.add(new Device("Bass Equalizer",        "GE-7B",    R.drawable.ge_7b,   R.drawable.ge_7b_small,1987, 1994,  0,  BASS_PEDALS, DYNAMICS_FILTER));
        list.add(new Device("Turbo Distortion",      "DS-2",     R.drawable.ds_2,    R.drawable.ds_2_small, 1987, 0,     R.string.ds_2,  DISTORTION_OVERDRIVE));
        list.add(new Device("Limiter",               "LM-2",     R.drawable.lm_2,    R.drawable.lm_2_small, 1987, 1991,  0,  DYNAMICS_FILTER));
        list.add(new Device("Digital Reverb",        "RV-2",     R.drawable.rv_2,    R.drawable.rv_2_small, 1987, 1989,  0,  DELAY_REVERB));
        list.add(new Device("Noise Suppressor",      "NS-2",     R.drawable.ns_2,    R.drawable.ns_2_small, 1987, 0,     0,  OTHERS));
        list.add(new Device("Digital Pitch Shifter", "PS-2",     R.drawable.ps_2,    R.drawable.ps_2_small, 1987, 1993,  0,  PITCH_MODULATION));
        list.add(new Device("Digital Metalizer",     "MZ-2",     R.drawable.mz_2,    R.drawable.mz_2_small, 1987, 1992,  0,  CHORUS, DISTORTION_OVERDRIVE, DELAY_REVERB, PITCH_MODULATION));
        list.add(new Device("Digital Dimension",     "DC-3",     R.drawable.dcc_3,   R.drawable.dcc_3_small,1988, 1993,  0,  CHORUS, PITCH_MODULATION));
        list.add(new Device("Digital Space D",       "DC-3",     R.drawable.dc_3,    R.drawable.dc_3_small, 1989, 1992,  0,  CHORUS, PITCH_MODULATION));
        list.add(new Device("SUPER Chorus (analog)",    "CH-1",     R.drawable.ch_1,    R.drawable.ch_1_small, 1989, 2001,     0,  CHORUS, PITCH_MODULATION));
        list.add(new Device("SUPER Chorus (digital)",    "CH-1",     R.drawable.ch_1,    R.drawable.ch_1_small, 2001, 0,     0,  CHORUS, PITCH_MODULATION));
        list.add(new Device("Enhancer",              "EH-2",     R.drawable.eh_2,    R.drawable.eh_2_small, 1990, 1998,  0,  OTHERS));
        list.add(new Device("Bass Limiter",          "LM-2B",    R.drawable.lmb_2,   R.drawable.lmb_2_small,1990, 1994,  0,  BASS_PEDALS, DYNAMICS_FILTER));
        list.add(new Device("Tremolo/Pan",           "PN-2",     R.drawable.pn_2,    R.drawable.pn_2_small, 1990, 1993,  0,  PITCH_MODULATION));
        list.add(new Device("Overdrive/Distortion",  "OS-2",     R.drawable.os_2,    R.drawable.os_2_small, 1990, 0,     R.string.os_2,  DISTORTION_OVERDRIVE));
        list.add(new Device("Metal Zone",            "MT-2",     R.drawable.mt_2,    R.drawable.mt_2_small, 1991, 0,     R.string.mt_2,  DISTORTION_OVERDRIVE));
        list.add(new Device("Parametric Equalizer",  "PQ-4",     R.drawable.pq_4,    R.drawable.pq_4_small, 1991, 1996,  0,  DYNAMICS_FILTER));
        list.add(new Device("Bass Parametric Equalizer", "PQ-3B",R.drawable.pqb_3,   R.drawable.pqb_3_small,1991, 1994,  0,  BASS_PEDALS, DYNAMICS_FILTER));
        list.add(new Device("Auto Wah",              "AW-2",     R.drawable.aw_2,    R.drawable.aw_2_small, 1991, 1999,  0,  DYNAMICS_FILTER));
        list.add(new Device("Chorus Ensemble (analog)", "CE-5",     R.drawable.ce_5,    R.drawable.ce_5_small, 1991, 2001,     0,  CHORUS, PITCH_MODULATION));
        list.add(new Device("Chorus Ensemble (digital)", "CE-5",     R.drawable.ce_5,    R.drawable.ce_5_small, 2001, 0,     0,  CHORUS, PITCH_MODULATION));
        list.add(new Device("Line Selector",         "LS-2",     R.drawable.ls_2,    R.drawable.ls_2_small, 1991, 0,     0,  OTHERS));
        list.add(new Device("HYPER Fuzz",            "FZ-2",     R.drawable.fz_2,    R.drawable.fz_2_small, 1993, 1997,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("DUAL Overdrive",        "SD-2",     R.drawable.sd_2,    R.drawable.sd_2_small, 1993, 1998,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("HYPER Metal",           "HM-3",     R.drawable.hm_3,    R.drawable.hm_3_small, 1993, 1999,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Digital Reverb/Delay",  "RV-3",     R.drawable.rv_3,    R.drawable.rv_3_small, 1994, 2002,  0,  DELAY_REVERB));
        list.add(new Device("Digital Pitch Shifter/Delay", "PS-3", R.drawable.ps_3,  R.drawable.ps_3_small, 1994, 1999,  0,  DELAY_REVERB, PITCH_MODULATION));
        list.add(new Device("TURBO OverDrive",       "OD-2R",    R.drawable.odr_2,   R.drawable.odr_2_small,1994, 1999,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Bass OverDrive",        "ODB-3",    R.drawable.odb_3,   R.drawable.odb_3_small,1994, 0,     0,  BASS_PEDALS, DISTORTION_OVERDRIVE));
        list.add(new Device("Harmonist",             "HR-2",     R.drawable.hr_2,    R.drawable.hr_2_small, 1994, 1999,  0,  PITCH_MODULATION));
        list.add(new Device("Bass Chorus (analog)",           "CEB-3",    R.drawable.ceb_3,   R.drawable.ceb_3_small,1995, 2001,     0,  CHORUS, BASS_PEDALS, PITCH_MODULATION));
        list.add(new Device("Bass Chorus (digital)",           "CEB-3",    R.drawable.ceb_3,   R.drawable.ceb_3_small,2001, 0,     0,  CHORUS, BASS_PEDALS, PITCH_MODULATION));
        list.add(new Device("Bass Limiter Enhancer", "LMB-3",    R.drawable.lmb_3,   R.drawable.lmb_3_small,1995, 0,     0,  BASS_PEDALS, DYNAMICS_FILTER));
        list.add(new Device("Bass Equalizer",        "GEB-7",    R.drawable.geb_7,   R.drawable.geb_7_small,1995, 0,     0,  BASS_PEDALS, DYNAMICS_FILTER));
        list.add(new Device("Blues Driver",          "BD-2",     R.drawable.bd_2,    R.drawable.bd_2_small, 1995, 0,     R.string.bd_2,  DISTORTION_OVERDRIVE));
        list.add(new Device("Digital Delay",         "DD-5",     R.drawable.dd_5,    R.drawable.dd_5_small, 1995, 2002,  0,  DELAY_REVERB));
        list.add(new Device("Power Driver",          "PW-2",     R.drawable.pw_2,    R.drawable.pw_2_small, 1996, 1997,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Bass Synthesizer",      "SYB-3",    R.drawable.syb_3,   R.drawable.syb_3_small,1996, 2004,  0,  OTHERS));
        list.add(new Device("Xtortion",              "XT-2",     R.drawable.xt_2,    R.drawable.xt_2_small, 1996, 1998,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Fuzz",                  "FZ-3",     R.drawable.fz_3,    R.drawable.fz_3_small, 1997, 1999,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Acoustic Simulator",    "AC-2",     R.drawable.ac_2,    R.drawable.ac_2_small, 1997, 2005,  0,  ACOUSTIC));
        list.add(new Device("Tremolo",               "TR-2",     R.drawable.tr_2,    R.drawable.tr_2_small, 1997, 0,     0,  PITCH_MODULATION));
        list.add(new Device("OverDrive",             "OD-3",     R.drawable.od_3,    R.drawable.od_3_small, 1997, 0,     R.string.od_3,  DISTORTION_OVERDRIVE));
        list.add(new Device("Chromatic Tuner",       "TU-2",     R.drawable.tu_2,    R.drawable.tu_2_small, 1998, 2010,  0,  OTHERS));
        list.add(new Device("SUPER Shifter",         "PS-5",     R.drawable.ps_5,    R.drawable.ps_5_small, 1999, 2010,  0,  PITCH_MODULATION));
        list.add(new Device("Phase Shifter",         "PH-3",     R.drawable.ph_3,    R.drawable.ph_3_small, 2000, 0,     0,  PITCH_MODULATION));
        list.add(new Device("Dynamic Wah",           "AW-3",     R.drawable.aw_3,    R.drawable.aw_3_small, 2000, 0,     0,  DYNAMICS_FILTER));
        list.add(new Device("Mega Distortion",       "MD-2",     R.drawable.md_2,    R.drawable.md_2_small, 2001, 0,     R.string.md_2,     0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Flanger",               "BF-3",     R.drawable.bf_3,    R.drawable.bf_3_small, 2002, 0,     0,  PITCH_MODULATION));
        list.add(new Device("Digital Delay",         "DD-6",     R.drawable.dd_6,    R.drawable.dd_6_small, 2002, 2008,  0,  DELAY_REVERB));
        list.add(new Device("Digital Reverb",        "RV-5",     R.drawable.rv_5,    R.drawable.rv_5_small, 2002, 2015,  0,  DELAY_REVERB));
        list.add(new Device("Super Octave",          "OC-3",     R.drawable.oc_3,    R.drawable.oc_3_small, 2003, 0,     0,  PITCH_MODULATION));
        list.add(new Device("Bass Synthesizer",      "SYB-5",    R.drawable.syb_5,   R.drawable.syb_5_small,2004, 0,     0,  OTHERS));
        list.add(new Device("Acoustic Simulator",    "AC-3",     R.drawable.ac_3,    R.drawable.ac_3_small, 2005, 0,     0,  ACOUSTIC));
        list.add(new Device("Loop Station",          "RC-2",     R.drawable.rc_2,    R.drawable.rc_2_small, 2006, 2011,  0,  OTHERS));
        list.add(new Device("Metal Core",            "ML-2",     R.drawable.ml_2,    R.drawable.ml_2_small, 2007, 0,     R.string.ml_2,  DISTORTION_OVERDRIVE));
        list.add(new Device("Fuzz",                  "FZ-5",     R.drawable.fz_5,    R.drawable.fz_5_small, 2007, 0,     R.string.fz_5,     0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Dyna Drive",            "DN-2",     R.drawable.dn_2,    R.drawable.dn_2_small, 2007, 2012,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Fender Bass Man",       "FBM-1",    R.drawable.fbm_1,   R.drawable.fbm_1_small,2007, 2013,  0,  BASS_PEDALS, AMP_EMULATOR));
        list.add(new Device("Fender Deluxe Reverb",  "FDR-1",    R.drawable.fdr_1,   R.drawable.fdr_1_small,2007, 2013,  0,  AMP_EMULATOR));
        list.add(new Device("Digital Delay",         "DD-7",     R.drawable.dd_7,    R.drawable.dd_7_small, 2008, 0,     0,  DELAY_REVERB));
        list.add(new Device("Chromatic Tuner",       "TU-3",     R.drawable.tu_3,    R.drawable.tu_3_small, 2009, 0,     0,  OTHERS));
        list.add(new Device("Fender Reverb",         "FRV-1",    R.drawable.frv_1,   R.drawable.frv_1_small,2009, 2019,     0,  AMP_EMULATOR));
        list.add(new Device("Harmonist",             "PS-6",     R.drawable.ps_6,    R.drawable.ps_6_small, 2010, 0,     0,  PITCH_MODULATION));
        list.add(new Device("Power Stack",           "ST-2",     R.drawable.st_2,    R.drawable.st_2_small, 2010, 0,     0,  AMP_EMULATOR));
        list.add(new Device("Loop Station",          "RC-3",     R.drawable.rc_3,    R.drawable.rc_3_small, 2011, 0,     0,  OTHERS));
        list.add(new Device("Combo Drive",           "BC-2",     R.drawable.bc_2,    R.drawable.bc_2_small, 2011, 2019,     R.string.bc_2,  DISTORTION_OVERDRIVE));
        list.add(new Device("Feedbacker/Booster",    "FB-2",     R.drawable.fb_2,    R.drawable.fb_2_small, 2011, 2015,  0,  DYNAMICS_FILTER));
        list.add(new Device("Tera Echo",             "TE-2",     R.drawable.te_2,    R.drawable.te_2_small, 2013, 0,     0,  DELAY_REVERB));
        list.add(new Device("Adaptive Distortion",   "DA-2",     R.drawable.da_2,    R.drawable.da_2_small, 2013, 2014,  0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Multi Overtone",        "MO-2",     R.drawable.mo_2,    R.drawable.mo_2_small, 2013, 0,     0,  PITCH_MODULATION));
        list.add(new Device("OverDrive",             "OD-1X",    R.drawable.odx_1,   R.drawable.odx_1_small,2014, 0,     R.string.od_1x,  DISTORTION_OVERDRIVE));
        list.add(new Device("Distortion",            "DS-1X",    R.drawable.dsx_1,   R.drawable.dsx_1_small,2014, 0,     R.string.ds_1x,  DISTORTION_OVERDRIVE));
        list.add(new Device("Blues Driver",          "BD-2W",    R.drawable.bdw_2,   R.drawable.bdw_2_small,2014, 0,     R.string.bd_2w,  DISTORTION_OVERDRIVE, WAZA_CRAFT));
        list.add(new Device("SUPER OverDrive",       "SD-1W",    R.drawable.sdw_1,   R.drawable.sdw_1_small,2014, 0,     R.string.sd_1w,  DISTORTION_OVERDRIVE, WAZA_CRAFT));
        list.add(new Device("Loop Station",          "RC-1",     R.drawable.rc_1,    R.drawable.rc_1_small, 2014, 0,     0,  OTHERS));
        list.add(new Device("Delay",                 "DM-2W",    R.drawable.dmw_2,   R.drawable.dmw_2_small,2015, 0,     0,  WAZA_CRAFT, DELAY_REVERB));
        list.add(new Device("Bass Driver",           "BB-1X",    R.drawable.bbx_1,   R.drawable.bbx_1_small,2015, 0,     0,  BASS_PEDALS));
        list.add(new Device("Reverb",                "RV-6",     R.drawable.rv_6,    R.drawable.rv_6_small, 2015, 0,     0,  DELAY_REVERB));
        list.add(new Device("Vocoder",               "VO-1",     R.drawable.vo_1,    R.drawable.vo_1_small, 2016, 0,     0,  OTHERS));
        list.add(new Device("Vibrato",               "VB-2W",    R.drawable.vbw_2,   R.drawable.vbw_2_small,2016, 0,     0,  PITCH_MODULATION, WAZA_CRAFT));
        list.add(new Device("Bass Comp",             "BC-1X",    R.drawable.bcx_1,   R.drawable.bcx_1_small,2016, 0,     0,  BASS_PEDALS, DYNAMICS_FILTER));
        list.add(new Device("Chromatic Tuner",       "TU-3S",    R.drawable.tus_3,   R.drawable.tus_3_small,2016, 0,     0,  OTHERS));
        list.add(new Device("Chromatic Tuner",       "TU-3W",    R.drawable.tuw_3,   R.drawable.tuw_3_small,2016, 0,     0,  OTHERS, WAZA_CRAFT));
        list.add(new Device("Chorus",                "CE-2W",    R.drawable.ce_2w,   R.drawable.ce_2w_small,2016, 0,     0,  CHORUS, WAZA_CRAFT, PITCH_MODULATION));
        list.add(new Device("Acoustic Preamp",       "AD-2",     R.drawable.ad_2,    R.drawable.ad_2_small, 2016, 0,     0,  ACOUSTIC));
        list.add(new Device("Compressor",            "CP-1X",    R.drawable.cpx_1,   R.drawable.cpx_1_small,2016, 0,     0,  DYNAMICS_FILTER));
        list.add(new Device("Distortion",            "DS-1-4A",  R.drawable.dsa_1,   R.drawable.dsa_1_small,2017, -2,    0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Angry Driver",          "JB-2",     R.drawable.jb_1,    R.drawable.jb_1_small, 2017, 0,     R.string.jb_2,  DISTORTION_OVERDRIVE));
        list.add(new Device("Metal Zone",            "MT-2W",    R.drawable.mt_2w,   R.drawable.mt_2w_small,2018, 0,       R.string.mt_2w,  DISTORTION_OVERDRIVE, WAZA_CRAFT));
        list.add(new Device("Digital Delay",         "DD-8",     R.drawable.dd_8,    R.drawable.dd_8_small, 2019, 0,       0,  DELAY_REVERB));
        list.add(new Device("Digital Delay",         "DD-3T",    R.drawable.dd_3t,   R.drawable.dd_3t_small,2019, 0,       0,  DELAY_REVERB));
        list.add(new Device("Dimension C",           "DC-2W",    R.drawable.dc_2w,   R.drawable.dc_2w_small,2018, 0,       0,  CHORUS, PITCH_MODULATION, WAZA_CRAFT));
        list.add(new Device("Synthesizer",           "SY-1",     R.drawable.sy_1,    R.drawable.sy_1_small, 2019, 0,       0,  OTHERS));
        list.add(new Device("Octaver",               "OC-5",     R.drawable.oc_5,    R.drawable.oc_5_small, 2020, 0,       0,  PITCH_MODULATION));
        list.add(new Device("Loop Station",          "RC-5",     R.drawable.rc_5,    R.drawable.rc_5_small, 2020, 0,       0,  OTHERS));
        list.add(new Device("Tone Bender",           "TB-2W",    R.drawable.tb_2w,   R.drawable.tb_2w_small, 2021, 0,    R.string.tb_2w,  DISTORTION_OVERDRIVE, WAZA_CRAFT));
        list.add(new Device("Heavy Metal",           "HM-2W",    R.drawable.hm_2w,   R.drawable.hm_2w_small, 2021, 0,    0,  DISTORTION_OVERDRIVE, WAZA_CRAFT));
        list.add(new Device("Metal Zone",            "MT-2-3A",  R.drawable.mt_2_a3, R.drawable.mt_2_a3_small, 2021, -2,    0,  DISTORTION_OVERDRIVE));
        list.add(new Device("Super Overdrive",       "SD-1-4A",  R.drawable.sd_1_4a,  R.drawable.sd_1_4a_small, 2021, -2,    0,  DISTORTION_OVERDRIVE));
        //20 Series
        list.add(new Device("Chorus Ensemble",       "CE-20",    R.drawable.ce_20,   R.drawable.ce_20_small, -1, -1,      R.string.ce_20, SERIES_20, CHORUS, PITCH_MODULATION));
        list.add(new Device("Giga Delay",            "DD-20",    R.drawable.dd_20,   R.drawable.dd_20_small, -1, -1,      0, SERIES_20, DELAY_REVERB));
        list.add(new Device("Advanced EQ",           "EQ-20",    R.drawable.eq_20,   R.drawable.eq_20_small, -1, -1,      0, SERIES_20, DYNAMICS_FILTER));
        list.add(new Device("Amp Factory",           "GP-20",    R.drawable.gp_20,   R.drawable.gp_20_small, -1, -1,      0, SERIES_20, AMP_EMULATOR));
        list.add(new Device("Poly Octave",           "OC-20G",   R.drawable.oc_20g,  R.drawable.oc_20g_small,-1, -1,      R.string.oc_20g, SERIES_20, PITCH_MODULATION));
        list.add(new Device("Drive Zone",            "OD-20",    R.drawable.od_20,   R.drawable.od_20_small, -1, -1,      0, SERIES_20, DISTORTION_OVERDRIVE));
        list.add(new Device("Loop Station",          "RC-20",    R.drawable.rc_20,   R.drawable.rc_20_small, -1, -1,      0, SERIES_20, OTHERS));
        list.add(new Device("Loop Station",          "RC-20XL",  R.drawable.rc_20xl, R.drawable.rc_20xl_small,-1,-1,      0, SERIES_20, OTHERS));
        list.add(new Device("Loop Station",          "RC-30",    R.drawable.rc_30,   R.drawable.rc_30_small, -1, 0,      0, SERIES_20, OTHERS));
        list.add(new Device("Space Echo",            "RE-20",    R.drawable.re_20,   R.drawable.re_20_small, -1, 0,      0, SERIES_20, DELAY_REVERB));
        list.add(new Device("Rotary Ensemble",       "RT-20",    R.drawable.rt_20,   R.drawable.rt_20_small, -1, 0,      R.string.rt_20, SERIES_20, PITCH_MODULATION));
        list.add(new Device("Slicer",                "SL-20",    R.drawable.sl_20,   R.drawable.sl_20_small, -1, 0,      0, SERIES_20, OTHERS));
        list.add(new Device("Vocal Performer",       "VE-20",    R.drawable.ve_20,   R.drawable.ve_20_small, -1, 0,      0, SERIES_20, OTHERS));
        list.add(new Device("Wave Processor",        "WP-20G",   R.drawable.wp20g,   R.drawable.wp20g_small, -1, -1,      0, SERIES_20, OTHERS));
        list.add(new Device("V-Guitar Distortion",   "GR-D",     R.drawable.gr_d,    R.drawable.gr_d_small,  -1, -1,      0, SERIES_20, OTHERS));
        list.add(new Device("V-Guitar Space",        "GR-S",     R.drawable.gr_s,    R.drawable.gr_s_small,  -1, -1,      0, SERIES_20, OTHERS));
        //10 Series
        list.add(new Device("Compressor Limiter",    "RCL-10",   R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rcl_10, SERIES_10, DYNAMICS_FILTER));
        list.add(new Device("Graphic Equalizer",     "RGE-10",   R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rge_10, SERIES_10, DYNAMICS_FILTER));
        list.add(new Device("Digital Delay",         "RDD-10",   R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rdd_10, SERIES_10, DELAY_REVERB));
        list.add(new Device("Phaser",                "RPH-10",   R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rph_10, SERIES_10, PITCH_MODULATION));
        list.add(new Device("Flanger",               "RBF-10",   R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rbf_10, SERIES_10, PITCH_MODULATION));
        list.add(new Device("Digital Chorus Ensemble","RCE-10",  R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rce_10, SERIES_10, CHORUS, PITCH_MODULATION));
        list.add(new Device("Digital Reverb",        "RRV-10",   R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rrv_10, SERIES_10, DELAY_REVERB));
        list.add(new Device("Overdrive / Distortion","ROD-10",   R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rod_10, SERIES_10, DISTORTION_OVERDRIVE));
        list.add(new Device("Pitch Shifter / Delay", "RPS-10",   R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rps_10, SERIES_10, DELAY_REVERB, PITCH_MODULATION));
        list.add(new Device("Preamp / Parametric EQ","RPQ-10",   R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rpq_10, SERIES_10, DYNAMICS_FILTER));
        list.add(new Device("Digital Sampler / Delay","RSD-10",  R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rsd_10, SERIES_10, DELAY_REVERB));
        list.add(new Device("Panning Delay",         "RPD-10",   R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rpd_10, SERIES_10, DELAY_REVERB));
        list.add(new Device("Power supply",          "RPW-7",    R.drawable.no_img,  R.drawable.no_img,      -1, -1,      R.string.rpw_7, SERIES_10, OTHERS));
        return list;
    }*/


}

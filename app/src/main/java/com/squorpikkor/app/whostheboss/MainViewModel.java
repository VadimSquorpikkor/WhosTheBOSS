package com.squorpikkor.app.whostheboss;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Pedal>> pedalList;

    public MutableLiveData<ArrayList<Pedal>> getPedalList() {
        if (pedalList == null) {
            pedalList = new MutableLiveData<>();
            loadList();
        }
        return pedalList;
    }
    private void loadList() {
        ArrayList<Pedal> list = new ArrayList<>();
        list.add(new Pedal("Over Drive", "OD-1", R.drawable.od_1, 1977, 1988));
        list.add(new Pedal("Spectrum", "SP-1", R.drawable.sp_1, 1977, 1981));
        list.add(new Pedal("Phaser", "PH-1", R.drawable.ph_1, 1977, 1981));
        list.add(new Pedal("Graphic Equalizer", "GE-6", R.drawable.ge_6, 1978, 1981));
        list.add(new Pedal("T-Wah / Touch Wah", "TW-1", R.drawable.tw_1, 1978, 1988));
        list.add(new Pedal("Distortion", "DS-1", R.drawable.ds_1, 1978, 0));
        list.add(new Pedal("Compression Sustainer", "CS-1", R.drawable.cs_1, 1978, 1982));
        list.add(new Pedal("Noise Gate", "NF-1", R.drawable.nf_1, 1979, 1982));
        list.add(new Pedal("Slow Gear", "SG-1", R.drawable.sg_1, 1979, 1982));
        list.add(new Pedal("Chorus", "CE-2", R.drawable.ce_2, 1979, 1991));
        list.add(new Pedal("Flanger", "BF-2", R.drawable.bf_2, 1980, 2001));
        list.add(new Pedal("Phaser", "PH-1R", R.drawable.ph_1r, 1980, 1985));
        list.add(new Pedal("SUPER OverDrive", "SD-1", R.drawable.sd_1, 1981, 0));
        list.add(new Pedal("Delay", "DM-2", R.drawable.dm_2, 1981, 1984));
        list.add(new Pedal("Graphic Equalizer", "GE-7", R.drawable.ge_7, 1981, 0));
        list.add(new Pedal("Compression Sustainer", "CS-2", R.drawable.cs_2, 1981, 1988));
        list.add(new Pedal("Vibrato", "VB-2", R.drawable.vb_2, 1982, 1984));
        list.add(new Pedal("Octave", "OC-2", R.drawable.oc_2, 1982, 2003));
        list.add(new Pedal("Power Supply & Master Switch", "PSM-5", R.drawable.psm_5, 1982, 1999));
        list.add(new Pedal("Chorus", "CE-3", R.drawable.ce_3, 1982, 1989));
        list.add(new Pedal("Heavy Metal", "HM-2", R.drawable.hm_2, 1983, 1992));
        list.add(new Pedal("Digital Delay", "DD-2", R.drawable.dd_2, 1984, 1986));
        list.add(new Pedal("Delay", "DM-3", R.drawable.dm_3, 1984, 1987));
        list.add(new Pedal("SUPER Feedbacker & Distortion", "DF-2", R.drawable.df_2, 1984, 1993));
        list.add(new Pedal("SUPER Phaser", "PH-2", R.drawable.ph_2, 1984, 2000));
        list.add(new Pedal("Digital Sampler/Delay", "DSD-2", R.drawable.dsd_2, 1985, 1986));
        list.add(new Pedal("TURBO OverDrive", "OD-2", R.drawable.od_2, 1985, 1994));
        list.add(new Pedal("Hi Band Flanger", "HF-2", R.drawable.hf_2, 1985, 1993));
        list.add(new Pedal("Dimension C", "DC-2", R.drawable.dc_2, 1985, 1988));
        list.add(new Pedal("Digital Sampler/Delay", "DSD-3", R.drawable.dsd_3, 1986, 1989));
        list.add(new Pedal("Compression Sustainer", "CS-3", R.drawable.cs_3, 1986, 0));
        list.add(new Pedal("Digital Delay", "DD-3", R.drawable.dd_3, 1986, 0));
        list.add(new Pedal("Dynamic Filter", "FT-2", R.drawable.ft_2, 1986, 1989));
        list.add(new Pedal("Bass Chorus", "CE-2B", R.drawable.ceb_2, 1987, 1994));
        list.add(new Pedal("Bass Flanger", "BF-2B", R.drawable.bfb_2, 1987, 1993));
        list.add(new Pedal("Bass Equalizer", "GE-7B", R.drawable.ge_7b, 1987, 1994));
        list.add(new Pedal("Turbo Distortion", "DS-2", R.drawable.ds_2, 1987, 0));
        list.add(new Pedal("Limiter", "LM-2", R.drawable.lm_2, 1987, 1991));
        list.add(new Pedal("Digital Reverb", "RV-2", R.drawable.rv_2, 1987, 1989));
        list.add(new Pedal("Noise Suppressor", "NS-2", R.drawable.ns_2, 1987, 0));
        list.add(new Pedal("Digital Pitch Shifter", "PS-2", R.drawable.ps_2, 1987, 1993));
        list.add(new Pedal("Digital Metalizer", "MZ-2", R.drawable.mz_2, 1987, 1992));
        list.add(new Pedal("Digital Dimension", "DC-3", R.drawable.no_image, 1988, 1992));
        list.add(new Pedal("Digital Space D", "DC-3", R.drawable.dc_3, 1988, 1992));
        list.add(new Pedal("SUPER Chorus (a/d)", "CH-1", R.drawable.ch_1, 1989, 0));
        list.add(new Pedal("Enhancer", "EH-2", R.drawable.eh_2, 1990, 1998));
        list.add(new Pedal("Bass Limiter", "LM-2B", R.drawable.lmb_2, 1990, 1994));
        list.add(new Pedal("Tremolo/Pan", "PN-2", R.drawable.pn_2, 1990, 1993));
        list.add(new Pedal("Overdrive/Distortion", "OS-2", R.drawable.os_2, 1990, 0));
        list.add(new Pedal("Metal Zone", "MT-2", R.drawable.mt_2, 1991, 0));
        list.add(new Pedal("Parametric Equalizer", "PQ-4", R.drawable.pq_4, 1991, 1996));
        list.add(new Pedal("Bass Parametric Equalizer", "PQ-3B", R.drawable.pqb_3, 1991, 1994));
        list.add(new Pedal("Auto Wah", "AW-2", R.drawable.aw_2, 1991, 1999));
        list.add(new Pedal("Chorus Ensemble (a/d)", "CE-5", R.drawable.ce_5, 1991, 0));
        list.add(new Pedal("Line Selector", "LS-2", R.drawable.ls_2, 1991, 0));
        list.add(new Pedal("HYPER Fuzz", "FZ-2", R.drawable.fz_2, 1993, 1997));
        list.add(new Pedal("DUAL Overdrive", "SD-2", R.drawable.sd_2, 1993, 1998));
        list.add(new Pedal("HYPER Metal", "HM-3", R.drawable.hm_3, 1993, 1999));
        list.add(new Pedal("Digital Reverb/Delay", "RV-3", R.drawable.rv_3, 1994, 2002));
        list.add(new Pedal("Digital Pitch Shifter/Delay", "PS-3", R.drawable.ps_3, 1994, 1999));
        list.add(new Pedal("TURBO OverDrive", "OD-2R", R.drawable.odr_2, 1994, 1999));
        list.add(new Pedal("Bass OverDrive", "ODB-3", R.drawable.odb_3, 1994, 0));
        list.add(new Pedal("Harmonist", "HR-2", R.drawable.hr_2, 1994, 1999));
        list.add(new Pedal("Bass Chorus", "CEB-3", R.drawable.ceb_3, 1995, 0));
        list.add(new Pedal("Bass Limiter Enhancer", "LMB-3", R.drawable.lmb_3, 1995, 0));
        list.add(new Pedal("Bass Equalizer", "GEB-7", R.drawable.geb_7, 1995, 0));
        list.add(new Pedal("Blues Driver", "BD-2", R.drawable.bd_2, 1995, 0));
        list.add(new Pedal("Digital Delay", "DD-5", R.drawable.dd_5, 1995, 2002));
        list.add(new Pedal("Power Driver", "PW-2", R.drawable.pw_2, 1996, 1997));
        list.add(new Pedal("Bass Synthesizer", "SYB-3", R.drawable.syb_3, 1996, 2004));
        list.add(new Pedal("Xtortion", "XT-2", R.drawable.xt_2, 1996, 1998));
        list.add(new Pedal("Fuzz", "FZ-3", R.drawable.fz_3, 1997, 1999));
        list.add(new Pedal("Acoustic Simulator", "AC-2", R.drawable.ac_2, 1997, 2005));
        list.add(new Pedal("Tremolo", "TR-2", R.drawable.tr_2, 1997, 0));
        list.add(new Pedal("OverDrive", "OD-3", R.drawable.odb_3, 1997, 0));
        list.add(new Pedal("Chromatic Tuner", "TU-2", R.drawable.tu_2, 1998, 2010));
        list.add(new Pedal("SUPER Shifter", "PS-5", R.drawable.ps_5, 1999, 2010));
        list.add(new Pedal("Phase Shifter", "PH-3", R.drawable.ph_3, 2000, 0));
        list.add(new Pedal("Dynamic Wah", "AW-3", R.drawable.aw_3, 2000, 0));
        list.add(new Pedal("Mega Distortion", "MD-2", R.drawable.md_2, 2001, 0));
        list.add(new Pedal("Flanger", "BF-3", R.drawable.bf_3, 2002, 0));
        list.add(new Pedal("Digital Delay", "DD-6", R.drawable.dd_6, 2002, 2008));
        list.add(new Pedal("Digital Reverb", "RV-5", R.drawable.rv_5, 2002, 2015));
        list.add(new Pedal("Super Octave", "OC-3", R.drawable.oc_3, 2003, 0));
        list.add(new Pedal("Bass Synthesizer", "SYB-5", R.drawable.syb_5, 2004, 0));
        list.add(new Pedal("Acoustic Simulator", "AC-3", R.drawable.ac_3, 2005, 0));
        list.add(new Pedal("Loop Station", "RC-2", R.drawable.rc_2, 2006, 2011));
        list.add(new Pedal("Metal Core", "ML-2", R.drawable.ml_2, 2007, 0));
        list.add(new Pedal("Fuzz", "FZ-5", R.drawable.fz_5, 2007, 0));
        list.add(new Pedal("Dyna Drive", "DN-2", R.drawable.dn_2, 2007, 2012));
        list.add(new Pedal("Fender Bass Man", "FBM-1", R.drawable.fbm_1, 2007, 2013));
        list.add(new Pedal("Fender Deluxe Reverb", "FDR-1", R.drawable.fdr_1, 2007, 2013));
        list.add(new Pedal("Digital Delay", "DD-7", R.drawable.dd_7, 2008, 0));
        list.add(new Pedal("Chromatic Tuner", "TU-3", R.drawable.tu_3, 2009, 0));
        list.add(new Pedal("Fender Reverb", "FRV-1", R.drawable.frv_1, 2009, 0));
        list.add(new Pedal("Harmonist", "PS-6", R.drawable.ps_6, 2010, 0));
        list.add(new Pedal("Power Stack", "ST-2", R.drawable.st_2, 2010, 0));
        list.add(new Pedal("Loop Station", "RC-3", R.drawable.rc_3, 2011, 0));
        list.add(new Pedal("Combo Drive", "BC-2", R.drawable.bc_2, 2011, 0));
        list.add(new Pedal("Feedbacker/Booster", "FB-2", R.drawable.fb_2, 2011, 2015));
        list.add(new Pedal("Tera Echo", "TE-2", R.drawable.te_2, 2013, 0));
        list.add(new Pedal("Adaptive Distortion", "DA-2", R.drawable.da_2, 2013, 2014));
        list.add(new Pedal("Multi Overtone", "MO-2", R.drawable.mo_2, 2013, 0));
        list.add(new Pedal("OverDrive", "OD-1X", R.drawable.odx_1, 2014, 0));
        list.add(new Pedal("Distortion", "DS-1X", R.drawable.dsx_1, 2014, 0));
        list.add(new Pedal("Blues Driver", "BD-2W", R.drawable.bdw_2, 2014, 0));
        list.add(new Pedal("SUPER OverDrive", "SD-1W", R.drawable.sdw_1, 2014, 0));
        list.add(new Pedal("Loop Station", "RC-1", R.drawable.rc_1, 2014, 0));
        list.add(new Pedal("Delay", "DM-2W", R.drawable.dmw_2, 2015, 0));
        list.add(new Pedal("Bass Driver", "BB-1X", R.drawable.bbx_1, 2015, 0));
        list.add(new Pedal("Reverb", "RV-6", R.drawable.rv_6, 2015, 0));
        list.add(new Pedal("Vocoder", "VO-1", R.drawable.vo_1, 2016, 0));
        list.add(new Pedal("Vibrato", "VB-2W", R.drawable.vbw_2, 2016, 0));
        list.add(new Pedal("Bass Comp", "BC-1X", R.drawable.bcx_1, 2016, 0));
        list.add(new Pedal("Chromatic Tuner", "TU-3S", R.drawable.tus_3, 2016, 0));
        list.add(new Pedal("Chromatic Tuner", "TU-3W", R.drawable.tuw_3, 2016, 0));
        list.add(new Pedal("Chorus", "CE-2W", R.drawable.ce_2w, 2016, 0));
        list.add(new Pedal("Acoustic Preamp", "AD-2", R.drawable.ad_2, 2016, 0));
        list.add(new Pedal("Compressor", "CP-1X", R.drawable.cpx_1, 2016, 0));
        list.add(new Pedal("Distortion", "DS-1, 4A", R.drawable.dsa_1, 2017, 0));
        list.add(new Pedal("Angry Driver", "JB-2", R.drawable.jb_1, 2017, 0));
        list.add(new Pedal("Metal Zone", "MT-2W", R.drawable.mt_2w, 0, 0));
        list.add(new Pedal("Digital Delay", "DD-8", R.drawable.dd_8, 0, 0));
        list.add(new Pedal("Digital Delay", "DD-3T", R.drawable.dd_3t, 0, 0));
        list.add(new Pedal("Dimension C", "DC-2W", R.drawable.dc_2w, 0, 0));
        list.add(new Pedal("Synthesizer", "SY-1", R.drawable.sy_1, 0, 0));
        list.add(new Pedal("Loop Station", "RC-3", R.drawable.rc_3, 0, 0));
        list.add(new Pedal("Octaver", "OC-5", R.drawable.oc_5, 0, 0));
        list.add(new Pedal("Loop Station", "RC-5", R.drawable.rc_5, 0, 0));
        list.add(new Pedal("Tone Bender", "TB-2W", R.drawable.tb_2w, 2021, 0));

        pedalList.setValue(list);
    }

    public Pedal getPedal(int position) {
        return pedalList.getValue().get(position);
    }
}

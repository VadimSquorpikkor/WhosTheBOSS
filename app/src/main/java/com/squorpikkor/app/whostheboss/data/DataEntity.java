package com.squorpikkor.app.whostheboss.data;

import android.util.Log;

import static com.squorpikkor.app.whostheboss.App.TAG;
import static com.squorpikkor.app.whostheboss.Device.ACOUSTIC;
import static com.squorpikkor.app.whostheboss.Device.ALL;
import static com.squorpikkor.app.whostheboss.Device.AMP_EMULATOR;
import static com.squorpikkor.app.whostheboss.Device.BASS_PEDALS;
import static com.squorpikkor.app.whostheboss.Device.CHORUS;
import static com.squorpikkor.app.whostheboss.Device.DELAY_REVERB;
import static com.squorpikkor.app.whostheboss.Device.DISTORTION_OVERDRIVE;
import static com.squorpikkor.app.whostheboss.Device.DYNAMICS_FILTER;
import static com.squorpikkor.app.whostheboss.Device.OTHERS;
import static com.squorpikkor.app.whostheboss.Device.PITCH_MODULATION;
import static com.squorpikkor.app.whostheboss.Device.SERIES_20;
import static com.squorpikkor.app.whostheboss.Device.WAZA_CRAFT;
import com.squorpikkor.app.whostheboss.Device;
import com.squorpikkor.app.whostheboss.SaveLoad;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DataEntity {

    /**Все устройства*/
    private ArrayList<Device> allDevices;

    private final Set<String> wishList;
    private final Set<String> haveList;

    public static final String WISH_SET = "wish_set";
    public static final String HAVE_SET = "have_set";

    public DataEntity() {
        allDevices = new ArrayList<>();
        allDevices = getAll();
        wishList = loadWishList();
        haveList = loadHaveList();
    }

    public List<Device> getWishDev() {
        ArrayList<Device> list = new ArrayList<>();
        for (Device dev:allDevices) {
            if (wishList.contains(dev.getId())) list.add(dev);
        }
        return list;
    }

    public List<Device> getHaveDev() {
        ArrayList<Device> list = new ArrayList<>();
        for (Device dev:allDevices) {
            if (haveList.contains(dev.getId())) list.add(dev);
        }
        return list;
    }

    private Set<String> loadWishList() {
        return SaveLoad.loadStringSet(WISH_SET);
    }

    private Set<String> loadHaveList() {
        return SaveLoad.loadStringSet(HAVE_SET);
    }

    private void saveWishList() {
        SaveLoad.saveSet(WISH_SET, wishList);
    }

    private void saveHaveList() {
        SaveLoad.saveSet(HAVE_SET, haveList);
    }

    public void removeFromWishList(String id) {
        wishList.remove(id);
        saveWishList();
    }

    public void addToWishList(String id) {
        wishList.add(id);
        saveWishList();
    }

    public void removeFromHaveList(String id) {
        haveList.remove(id);
        saveHaveList();
    }

    public void addToHaveList(String id) {
        haveList.add(id);
        saveHaveList();
    }


    public ArrayList<Device> getAllDev() {
        return allDevices;
    }

    ////("SELECT * FROM devices WHERE category%(:cat*2) >= :cat")
    public ArrayList<Device> getAllDevByCat(int selectedCat) {
        if (selectedCat==ALL) return allDevices;
        ArrayList<Device> list = new ArrayList<>();
        for (Device dev:allDevices) {
            if (dev.getCategory()%(selectedCat*2) >= selectedCat) list.add(dev);
        }
        return list;
    }

    private ArrayList<Device> getAll() {
        ArrayList<Device> list = new ArrayList<>();
        //todo может есть смысл сделать void метод и просто добавлять в allDevices
        //return new ArrayList<>();
//        return new ArrayList<>(
//                Arrays.asList(
        list.add(new Device("Over Drive",                "OD-1",     "1977-1988",      DISTORTION_OVERDRIVE));
        list.add(new Device("Spectrum",                  "SP-1",     "1977-1981",      PITCH_MODULATION));
        list.add(new Device("Phaser",                    "PH-1",     "1977-1981",      PITCH_MODULATION));
        list.add(new Device("Graphic Equalizer",         "GE-6",     "1978-1981",      DYNAMICS_FILTER));
        list.add(new Device("T-Wah",                     "TW-1",     "1978-1988",      DYNAMICS_FILTER));
        list.add(new Device("Touch Wah",                 "TW-1_2",   "1978-1988",      DYNAMICS_FILTER));
        list.add(new Device("Distortion",                "DS-1",     "1978-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Compression Sustainer",     "CS-1",     "1978-1982",      DYNAMICS_FILTER));
        list.add(new Device("Noise Gate",                "NF-1",     "1979-1982",      OTHERS));
        list.add(new Device("Slow Gear",                 "SG-1",     "1979-1982",      DYNAMICS_FILTER));
        list.add(new Device("Chorus",                    "CE-2",     "1979-1991", CHORUS + PITCH_MODULATION));
        list.add(new Device("Flanger",                   "BF-2",     "1980-2001",      PITCH_MODULATION));
        list.add(new Device("Phaser",                    "PH-1R",    "1980-1985",      PITCH_MODULATION));
        list.add(new Device("SUPER OverDrive",           "SD-1",     "1981-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Delay",                     "DM-2",     "1981-1984",      DELAY_REVERB));
        list.add(new Device("Graphic Equalizer",         "GE-7",     "1981-now",       DYNAMICS_FILTER));
        list.add(new Device("Compression Sustainer",     "CS-2",     "1981-1988",      DYNAMICS_FILTER));
        list.add(new Device("Vibrato",                   "VB-2",     "1982-1984",      PITCH_MODULATION));
        list.add(new Device("Octaver",                   "OC-2_2",   "1982-1984",      PITCH_MODULATION));
        list.add(new Device("Octave",                    "OC-2",     "1984-2003",      PITCH_MODULATION));
        list.add(new Device("Power Supply & Master Switch", "PSM-5", "1982-1999",      OTHERS));
        list.add(new Device("Chorus",                    "CE-3",     "1982-1989",      CHORUS + PITCH_MODULATION));
        list.add(new Device("Heavy Metal",               "HM-2",     "1983-1992",      DISTORTION_OVERDRIVE));
        list.add(new Device("Digital Delay",             "DD-2",     "1984-1986",      DELAY_REVERB));
        list.add(new Device("Delay",                     "DM-3",     "1984-1987",      DELAY_REVERB));
        list.add(new Device("SUPER Feedbacker & Distortion", "DF-2", "1984-1993",      DISTORTION_OVERDRIVE));
        list.add(new Device("SUPER Phaser",              "PH-2",     "1984-2000",      PITCH_MODULATION));
        list.add(new Device("Digital Sampler/Delay",     "DSD-2",    "1985-1986",      DELAY_REVERB));
        list.add(new Device("TURBO OverDrive",           "OD-2",     "1985-1994",      DISTORTION_OVERDRIVE));
        list.add(new Device("Hi Band Flanger",           "HF-2",     "1985-1993",      PITCH_MODULATION));
        list.add(new Device("Dimension C",               "DC-2",     "1985-1988", CHORUS + PITCH_MODULATION));
        list.add(new Device("Digital Sampler/Delay",     "DSD-3",    "1986-1989",      DELAY_REVERB));
        list.add(new Device("Compression Sustainer",     "CS-3",     "1986-now",       DYNAMICS_FILTER));
        list.add(new Device("Digital Delay",             "DD-3",     "1986-2019",      DELAY_REVERB));
        list.add(new Device("Dynamic Filter",            "FT-2",     "1986-1989",      DYNAMICS_FILTER));
        list.add(new Device("Bass Chorus",               "CE-2B",    "1987-1994", CHORUS + BASS_PEDALS + PITCH_MODULATION));
        list.add(new Device("Bass Flanger",              "BF-2B",    "1987-1993", BASS_PEDALS + PITCH_MODULATION));
        list.add(new Device("Bass Equalizer",            "GE-7B",    "1987-1994", BASS_PEDALS + DYNAMICS_FILTER));
        list.add(new Device("Turbo Distortion",          "DS-2",     "1987-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Limiter",                   "LM-2",     "1987-1991",      DYNAMICS_FILTER));
        list.add(new Device("Digital Reverb",            "RV-2",     "1987-1989",      DELAY_REVERB));
        list.add(new Device("Noise Suppressor",          "NS-2",     "1987-now",       OTHERS));
        list.add(new Device("Digital Pitch Shifter",     "PS-2",     "1987-1993",      PITCH_MODULATION));
        list.add(new Device("Digital Metalizer",         "MZ-2",     "1987-1992", CHORUS + DISTORTION_OVERDRIVE + DELAY_REVERB + PITCH_MODULATION));
        list.add(new Device("Digital Dimension",         "DC-3_2",   "1988-1993", CHORUS + PITCH_MODULATION));
        list.add(new Device("Digital Space D",           "DC-3",     "1989-1992", CHORUS + PITCH_MODULATION));
        list.add(new Device("SUPER Chorus (analog)",     "CH-1",     "1989-2001", CHORUS + PITCH_MODULATION));
        list.add(new Device("SUPER Chorus (digital)",    "CH-1",     "2001-now",  CHORUS + PITCH_MODULATION));
        list.add(new Device("Enhancer",                  "EH-2",     "1990-1998",      OTHERS));
        list.add(new Device("Bass Limiter",              "LM-2B",    "1990-1994", BASS_PEDALS + DYNAMICS_FILTER));
        list.add(new Device("Tremolo/Pan",               "PN-2",     "1990-1993",      PITCH_MODULATION));
        list.add(new Device("Overdrive/Distortion",      "OS-2",     "1990-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Metal Zone",                "MT-2",     "1991-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Parametric Equalizer",      "PQ-4",     "1991-1996",      DYNAMICS_FILTER));
        list.add(new Device("Bass Parametric Equalizer", "PQ-3B",    "1991-1994", BASS_PEDALS + DYNAMICS_FILTER));
        list.add(new Device("Auto Wah",                  "AW-2",     "1991-1999",      DYNAMICS_FILTER));
        list.add(new Device("Chorus Ensemble (analog)",  "CE-5",     "1991-2001", CHORUS + PITCH_MODULATION));
        list.add(new Device("Chorus Ensemble (digital)", "CE-5",     "2001-now",  CHORUS + PITCH_MODULATION));
        list.add(new Device("Line Selector",             "LS-2",     "1991-now",       OTHERS));
        list.add(new Device("HYPER Fuzz",                "FZ-2",     "1993-1997",      DISTORTION_OVERDRIVE));
        list.add(new Device("DUAL Overdrive",            "SD-2",     "1993-1998",      DISTORTION_OVERDRIVE));
        list.add(new Device("HYPER Metal",               "HM-3",     "1993-1999",      DISTORTION_OVERDRIVE));
        list.add(new Device("Digital Reverb/Delay",      "RV-3",     "1994-2002",      DELAY_REVERB));
        list.add(new Device("Digital Pitch Shifter/Delay","PS-3",    "1994-1999", DELAY_REVERB + PITCH_MODULATION));
        list.add(new Device("TURBO OverDrive",           "OD-2R",    "1994-1999",      DISTORTION_OVERDRIVE));
        list.add(new Device("Bass OverDrive",            "ODB-3",    "1994-now",  BASS_PEDALS + DISTORTION_OVERDRIVE));
        list.add(new Device("Harmonist",                 "HR-2",     "1994-1999",      PITCH_MODULATION));
        list.add(new Device("Bass Chorus (analog)",      "CEB-3",    "1995-2001", CHORUS + BASS_PEDALS + PITCH_MODULATION));
        list.add(new Device("Bass Chorus (digital)",     "CEB-3",    "2001-now",  CHORUS + BASS_PEDALS + PITCH_MODULATION));
        list.add(new Device("Bass Limiter Enhancer",     "LMB-3",    "1995-now",  BASS_PEDALS + DYNAMICS_FILTER));
        list.add(new Device("Bass Equalizer",            "GEB-7",    "1995-now",  BASS_PEDALS + DYNAMICS_FILTER));
        list.add(new Device("Blues Driver",              "BD-2",     "1995-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Digital Delay",             "DD-5",     "1995-2002",      DELAY_REVERB));
        list.add(new Device("Power Driver",              "PW-2",     "1996-1997",      DISTORTION_OVERDRIVE));
        list.add(new Device("Bass Synthesizer",          "SYB-3",    "1996-2004",      OTHERS));
        list.add(new Device("Xtortion",                  "XT-2",     "1996-1998",      DISTORTION_OVERDRIVE));
        list.add(new Device("Fuzz",                      "FZ-3",     "1997-1999",      DISTORTION_OVERDRIVE));
        list.add(new Device("Acoustic Simulator",        "AC-2",     "1997-2005",      ACOUSTIC));
        list.add(new Device("Tremolo",                   "TR-2",     "1997-now",       PITCH_MODULATION));
        list.add(new Device("OverDrive",                 "OD-3",     "1997-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Chromatic Tuner",           "TU-2",     "1998-2010",      OTHERS));
        list.add(new Device("SUPER Shifter",             "PS-5",     "1999-2010",      PITCH_MODULATION));
        list.add(new Device("Phase Shifter",             "PH-3",     "2000-now",       PITCH_MODULATION));
        list.add(new Device("Dynamic Wah",               "AW-3",     "2000-now",       DYNAMICS_FILTER));
        list.add(new Device("Mega Distortion",           "MD-2",     "2001-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Flanger",                   "BF-3",     "2002-now",       PITCH_MODULATION));
        list.add(new Device("Digital Delay",             "DD-6",     "2002-2008",      DELAY_REVERB));
        list.add(new Device("Digital Reverb",            "RV-5",     "2002-2015",      DELAY_REVERB));
        list.add(new Device("Super Octave",              "OC-3",     "2003-now",       PITCH_MODULATION));
        list.add(new Device("Bass Synthesizer",          "SYB-5",    "2004-now",       OTHERS));
        list.add(new Device("Acoustic Simulator",        "AC-3",     "2005-now",       ACOUSTIC));
        list.add(new Device("Loop Station",              "RC-2",     "2006-2011",      OTHERS));
        list.add(new Device("Metal Core",                "ML-2",     "2007-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Fuzz",                      "FZ-5",     "2007-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Dyna Drive",                "DN-2",     "2007-2012",      DISTORTION_OVERDRIVE));
        list.add(new Device("Fender Bass Man",           "FBM-1",    "2007-2013",  BASS_PEDALS + AMP_EMULATOR));
        list.add(new Device("Fender Deluxe Reverb",      "FDR-1",    "2007-2013",      AMP_EMULATOR));
        list.add(new Device("Digital Delay",             "DD-7",     "2008-now",       DELAY_REVERB));
        list.add(new Device("Chromatic Tuner",           "TU-3",     "2009-now",       OTHERS));
        list.add(new Device("Fender Reverb",             "FRV-1",    "2009-2019",      AMP_EMULATOR));
        list.add(new Device("Harmonist",                 "PS-6",     "2010-now",       PITCH_MODULATION));
        list.add(new Device("Power Stack",               "ST-2",     "2010-now",       AMP_EMULATOR));
        list.add(new Device("Loop Station",              "RC-3",     "2011-now",       OTHERS));
        list.add(new Device("Combo Drive",               "BC-2",     "2011-2019",      DISTORTION_OVERDRIVE));
        list.add(new Device("Feedbacker/Booster",        "FB-2",     "2011-2015",      DYNAMICS_FILTER));
        list.add(new Device("Tera Echo",                 "TE-2",     "2013-now",       DELAY_REVERB));
        list.add(new Device("Adaptive Distortion",       "DA-2",     "2013-2014",      DISTORTION_OVERDRIVE));
        list.add(new Device("Multi Overtone",            "MO-2",     "2013-now",       PITCH_MODULATION));
        list.add(new Device("OverDrive",                 "OD-1X",    "2014-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Distortion",                "DS-1X",    "2014-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Blues Driver",              "BD-2W",    "2014-now",   DISTORTION_OVERDRIVE + WAZA_CRAFT));
        list.add(new Device("SUPER OverDrive",           "SD-1W",    "2014-now",   DISTORTION_OVERDRIVE + WAZA_CRAFT));
        list.add(new Device("Loop Station",              "RC-1",     "2014-now",       OTHERS));
        list.add(new Device("Delay",                     "DM-2W",    "2015-now",   WAZA_CRAFT + DELAY_REVERB));
        list.add(new Device("Bass Driver",               "BB-1X",    "2015-now",       BASS_PEDALS));
        list.add(new Device("Reverb",                    "RV-6",     "2015-now",       DELAY_REVERB));
        list.add(new Device("Vocoder",                   "VO-1",     "2016-now",       OTHERS));
        list.add(new Device("Vibrato",                   "VB-2W",    "2016-now",   PITCH_MODULATION + WAZA_CRAFT));
        list.add(new Device("Bass Comp",                 "BC-1X",    "2016-now",   BASS_PEDALS + DYNAMICS_FILTER));
        list.add(new Device("Chromatic Tuner",           "TU-3S",    "2016-now",       OTHERS));
        list.add(new Device("Chromatic Tuner",           "TU-3W",    "2016-now",   OTHERS + WAZA_CRAFT));
        list.add(new Device("Chorus",                    "CE-2W",    "2016-now",   CHORUS + WAZA_CRAFT + PITCH_MODULATION));
        list.add(new Device("Acoustic Preamp",           "AD-2",     "2016-now",       ACOUSTIC));
        list.add(new Device("Compressor",                "CP-1X",    "2016-now",       DYNAMICS_FILTER));
        list.add(new Device("Distortion",                "DS-1-4A",  "2017",           DISTORTION_OVERDRIVE));
        list.add(new Device("Angry Driver",              "JB-2",     "2017-now",       DISTORTION_OVERDRIVE));
        list.add(new Device("Metal Zone",                "MT-2W",    "2018-now",   DISTORTION_OVERDRIVE + WAZA_CRAFT));
        list.add(new Device("Digital Delay",             "DD-8",     "2019-now",       DELAY_REVERB));
        list.add(new Device("Digital Delay",             "DD-3T",    "2019-now",       DELAY_REVERB));
        list.add(new Device("Dimension C",               "DC-2W",    "2018-now",   CHORUS + PITCH_MODULATION + WAZA_CRAFT));
        list.add(new Device("Synthesizer",               "SY-1",     "2019-now",       OTHERS));
        list.add(new Device("Octaver",                   "OC-5",     "2020-now",       PITCH_MODULATION));
        list.add(new Device("Loop Station",              "RC-5",     "2020-now",       OTHERS));
        list.add(new Device("Tone Bender",               "TB-2W",    "2021-now",   DISTORTION_OVERDRIVE + WAZA_CRAFT));
        list.add(new Device("Heavy Metal",               "HM-2W",    "2021-now",   DISTORTION_OVERDRIVE + WAZA_CRAFT));
        list.add(new Device("Metal Zone",                "MT-2-3A",  "2021",           DISTORTION_OVERDRIVE));
        list.add(new Device("Super Overdrive",           "SD-1-4A",  "2021",           DISTORTION_OVERDRIVE));
        list.add(new Device("Fuzz",                      "FZ-1W",    "2021-now",   DISTORTION_OVERDRIVE + WAZA_CRAFT));
        //20 Series
        list.add(new Device("Chorus Ensemble",           "CE-20",    "???",  SERIES_20 + CHORUS + PITCH_MODULATION));
        list.add(new Device("Giga Delay",                "DD-20",    "???",  SERIES_20 + DELAY_REVERB));
        list.add(new Device("Advanced EQ",               "EQ-20",    "???",  SERIES_20 + DYNAMICS_FILTER));
        list.add(new Device("Amp Factory",               "GP-20",    "???",  SERIES_20 + AMP_EMULATOR));
        list.add(new Device("Poly Octave",               "OC-20G",   "???",  SERIES_20 + PITCH_MODULATION));
        list.add(new Device("Drive Zone",                "OD-20",    "???",  SERIES_20 + DISTORTION_OVERDRIVE));
        list.add(new Device("Loop Station",              "RC-20",    "???",  SERIES_20 + OTHERS));
        list.add(new Device("Loop Station",              "RC-20XL",  "???",  SERIES_20 + OTHERS));
        list.add(new Device("Loop Station",              "RC-30",    "???",  SERIES_20 + OTHERS));
        list.add(new Device("Space Echo",                "RE-20",    "???",  SERIES_20 + DELAY_REVERB));
        list.add(new Device("Rotary Ensemble",           "RT-20",    "???",  SERIES_20 + PITCH_MODULATION));
        list.add(new Device("Slicer",                    "SL-20",    "???",  SERIES_20 + OTHERS));
        list.add(new Device("Vocal Performer",           "VE-20",    "???",  SERIES_20 + OTHERS));
        list.add(new Device("Wave Processor",            "WP-20G",   "???",  SERIES_20 + OTHERS));
        list.add(new Device("V-Guitar Distortion",       "GR-D",     "???",  SERIES_20 + OTHERS));
        list.add(new Device("V-Guitar Space",            "GR-S",     "???",  SERIES_20 + OTHERS));
        //10 Series
        list.add(new Device("Compressor Limiter",        "RCL-10",   "???",  DYNAMICS_FILTER));
        list.add(new Device("Graphic Equalizer",         "RGE-10",   "???",  DYNAMICS_FILTER));
        list.add(new Device("Digital Delay",             "RDD-10",   "???",  DELAY_REVERB));
        list.add(new Device("Phaser",                    "RPH-10",   "???",  PITCH_MODULATION));
        list.add(new Device("Flanger",                   "RBF-10",   "???",  PITCH_MODULATION));
        list.add(new Device("Digital Chorus Ensemble",   "RCE-10",   "???",  CHORUS + PITCH_MODULATION));
        list.add(new Device("Digital Reverb",            "RRV-10",   "???",  DELAY_REVERB));
        list.add(new Device("Overdrive / Distortion",    "ROD-10",   "???",  DISTORTION_OVERDRIVE));
        list.add(new Device("Pitch Shifter / Delay",     "RPS-10",   "???",  DELAY_REVERB + PITCH_MODULATION));
        list.add(new Device("Preamp / Parametric EQ",    "RPQ-10",   "???",  DYNAMICS_FILTER));
        list.add(new Device("Digital Sampler / Delay",   "RSD-10",   "???",  DELAY_REVERB));
        list.add(new Device("Panning Delay",             "RPD-10",   "???",  DELAY_REVERB));
        list.add(new Device("Power supply",              "RPW-7",    "???",  OTHERS));
//                )
//        );
        Log.e(TAG, "@@@@getAll: "+list.size());
        return list;
    }



}

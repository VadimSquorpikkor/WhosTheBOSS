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
import static com.squorpikkor.app.whostheboss.Device.SERIES_20;
import static com.squorpikkor.app.whostheboss.Device.WAZA_CRAFT;
import com.squorpikkor.app.whostheboss.Device;

public class DataEntity {

    static Device[] getAll() {
        return new Device[]{
        new Device("Over Drive",                "OD-1",     "1977-1988", 0,     DISTORTION_OVERDRIVE),
        new Device("Spectrum",                  "SP-1",     "1977-1981", 0,     PITCH_MODULATION),
        new Device("Phaser",                    "PH-1",     "1977-1981", 0,     PITCH_MODULATION),
        new Device("Graphic Equalizer",         "GE-6",     "1978-1981", 0,     DYNAMICS_FILTER),
        new Device("T-Wah",                     "TW-1",     "1978-1988", 0,     DYNAMICS_FILTER),
        new Device("Touch Wah",                 "TW-1",     "1978-1988", 0,     DYNAMICS_FILTER),
        new Device("Distortion",                "DS-1",     "1978-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Compression Sustainer",     "CS-1",     "1978-1982", 0,     DYNAMICS_FILTER),
        new Device("Noise Gate",                "NF-1",     "1979-1982", 0,     OTHERS),
        new Device("Slow Gear",                 "SG-1",     "1979-1982", 0,     DYNAMICS_FILTER),
        new Device("Chorus",                    "CE-2",     "1979-1991", 0,CHORUS + PITCH_MODULATION),
        new Device("Flanger",                   "BF-2",     "1980-2001", 0,     PITCH_MODULATION),
        new Device("Phaser",                    "PH-1R",    "1980-1985", 0,     PITCH_MODULATION),
        new Device("SUPER OverDrive",           "SD-1",     "1981-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Delay",                     "DM-2",     "1981-1984", 0,     DELAY_REVERB),
        new Device("Graphic Equalizer",         "GE-7",     "1981-now",  0,     DYNAMICS_FILTER),
        new Device("Compression Sustainer",     "CS-2",     "1981-1988", 0,     DYNAMICS_FILTER),
        new Device("Vibrato",                   "VB-2",     "1982-1984", 0,     PITCH_MODULATION),
        new Device("Octaver",                   "OC-2",     "1982-1984", 0,     PITCH_MODULATION),
        new Device("Octave",                    "OC-2",     "1984-2003", 0,     PITCH_MODULATION),
        new Device("Power Supply & Master Switch", "PSM-5", "1982-1999", 0,     OTHERS),
        new Device("Chorus",                    "CE-3",     "1982-1989", 0,     CHORUS + PITCH_MODULATION),
        new Device("Heavy Metal",               "HM-2",     "1983-1992", 0,     DISTORTION_OVERDRIVE),
        new Device("Digital Delay",             "DD-2",     "1984-1986", 0,     DELAY_REVERB),
        new Device("Delay",                     "DM-3",     "1984-1987", 0,     DELAY_REVERB),
        new Device("SUPER Feedbacker & Distortion", "DF-2", "1984-1993", 0,     DISTORTION_OVERDRIVE),
        new Device("SUPER Phaser",              "PH-2",     "1984-2000", 0,     PITCH_MODULATION),
        new Device("Digital Sampler/Delay",     "DSD-2",    "1985-1986", 0,     DELAY_REVERB),
        new Device("TURBO OverDrive",           "OD-2",     "1985-1994", 0,     DISTORTION_OVERDRIVE),
        new Device("Hi Band Flanger",           "HF-2",     "1985-1993", 0,     PITCH_MODULATION),
        new Device("Dimension C",               "DC-2",     "1985-1988", 0,CHORUS + PITCH_MODULATION),
        new Device("Digital Sampler/Delay",     "DSD-3",    "1986-1989", 0,     DELAY_REVERB),
        new Device("Compression Sustainer",     "CS-3",     "1986-now",  0,     DYNAMICS_FILTER),
        new Device("Digital Delay",             "DD-3",     "1986-2019", 0,     DELAY_REVERB),
        new Device("Dynamic Filter",            "FT-2",     "1986-1989", 0,     DYNAMICS_FILTER),
        new Device("Bass Chorus",               "CE-2B",    "1987-1994", 0,CHORUS + BASS_PEDALS + PITCH_MODULATION),
        new Device("Bass Flanger",              "BF-2B",    "1987-1993", 0,BASS_PEDALS + PITCH_MODULATION),
        new Device("Bass Equalizer",            "GE-7B",    "1987-1994", 0,BASS_PEDALS + DYNAMICS_FILTER),
        new Device("Turbo Distortion",          "DS-2",     "1987-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Limiter",                   "LM-2",     "1987-1991", 0,     DYNAMICS_FILTER),
        new Device("Digital Reverb",            "RV-2",     "1987-1989", 0,     DELAY_REVERB),
        new Device("Noise Suppressor",          "NS-2",     "1987-now",  0,     OTHERS),
        new Device("Digital Pitch Shifter",     "PS-2",     "1987-1993", 0,     PITCH_MODULATION),
        new Device("Digital Metalizer",         "MZ-2",     "1987-1992", 0,CHORUS + DISTORTION_OVERDRIVE + DELAY_REVERB + PITCH_MODULATION),
        new Device("Digital Dimension",         "DC-3",     "1988-1993", 0,CHORUS + PITCH_MODULATION),
        new Device("Digital Space D",           "DC-3",     "1989-1992", 0,CHORUS + PITCH_MODULATION),
        new Device("SUPER Chorus (analog)",     "CH-1",     "1989-2001", 0,CHORUS + PITCH_MODULATION),
        new Device("SUPER Chorus (digital)",    "CH-1",     "2001-now",  0,CHORUS + PITCH_MODULATION),
        new Device("Enhancer",                  "EH-2",     "1990-1998", 0,     OTHERS),
        new Device("Bass Limiter",              "LM-2B",    "1990-1994", 0,BASS_PEDALS + DYNAMICS_FILTER),
        new Device("Tremolo/Pan",               "PN-2",     "1990-1993", 0,     PITCH_MODULATION),
        new Device("Overdrive/Distortion",      "OS-2",     "1990-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Metal Zone",                "MT-2",     "1991-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Parametric Equalizer",      "PQ-4",     "1991-1996", 0,     DYNAMICS_FILTER),
        new Device("Bass Parametric Equalizer", "PQ-3B",    "1991-1994", 0,BASS_PEDALS + DYNAMICS_FILTER),
        new Device("Auto Wah",                  "AW-2",     "1991-1999", 0,     DYNAMICS_FILTER),
        new Device("Chorus Ensemble (analog)",  "CE-5",     "1991-2001", 0,CHORUS + PITCH_MODULATION),
        new Device("Chorus Ensemble (digital)", "CE-5",     "2001-now",  0,CHORUS + PITCH_MODULATION),
        new Device("Line Selector",             "LS-2",     "1991-now",  0,     OTHERS),
        new Device("HYPER Fuzz",                "FZ-2",     "1993-1997", 0,     DISTORTION_OVERDRIVE),
        new Device("DUAL Overdrive",            "SD-2",     "1993-1998", 0,     DISTORTION_OVERDRIVE),
        new Device("HYPER Metal",               "HM-3",     "1993-1999", 0,     DISTORTION_OVERDRIVE),
        new Device("Digital Reverb/Delay",      "RV-3",     "1994-2002", 0,     DELAY_REVERB),
        new Device("Digital Pitch Shifter/Delay","PS-3",    "1994-1999", 0,DELAY_REVERB + PITCH_MODULATION),
        new Device("TURBO OverDrive",           "OD-2R",    "1994-1999", 0,     DISTORTION_OVERDRIVE),
        new Device("Bass OverDrive",            "ODB-3",    "1994-now",  0,BASS_PEDALS + DISTORTION_OVERDRIVE),
        new Device("Harmonist",                 "HR-2",     "1994-1999", 0,     PITCH_MODULATION),
        new Device("Bass Chorus (analog)",      "CEB-3",    "1995-2001", 0,CHORUS + BASS_PEDALS + PITCH_MODULATION),
        new Device("Bass Chorus (digital)",     "CEB-3",    "2001-now",  0,CHORUS + BASS_PEDALS + PITCH_MODULATION),
        new Device("Bass Limiter Enhancer",     "LMB-3",    "1995-now",  0,BASS_PEDALS + DYNAMICS_FILTER),
        new Device("Bass Equalizer",            "GEB-7",    "1995-now",  0,BASS_PEDALS + DYNAMICS_FILTER),
        new Device("Blues Driver",              "BD-2",     "1995-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Digital Delay",             "DD-5",     "1995-2002", 0,     DELAY_REVERB),
        new Device("Power Driver",              "PW-2",     "1996-1997", 0,     DISTORTION_OVERDRIVE),
        new Device("Bass Synthesizer",          "SYB-3",    "1996-2004", 0,     OTHERS),
        new Device("Xtortion",                  "XT-2",     "1996-1998", 0,     DISTORTION_OVERDRIVE),
        new Device("Fuzz",                      "FZ-3",     "1997-1999", 0,     DISTORTION_OVERDRIVE),
        new Device("Acoustic Simulator",        "AC-2",     "1997-2005", 0,     ACOUSTIC),
        new Device("Tremolo",                   "TR-2",     "1997-now",  0,     PITCH_MODULATION),
        new Device("OverDrive",                 "OD-3",     "1997-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Chromatic Tuner",           "TU-2",     "1998-2010", 0,     OTHERS),
        new Device("SUPER Shifter",             "PS-5",     "1999-2010", 0,     PITCH_MODULATION),
        new Device("Phase Shifter",             "PH-3",     "2000-now",  0,     PITCH_MODULATION),
        new Device("Dynamic Wah",               "AW-3",     "2000-now",  0,     DYNAMICS_FILTER),
        new Device("Mega Distortion",           "MD-2",     "2001-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Flanger",                   "BF-3",     "2002-now",  0,     PITCH_MODULATION),
        new Device("Digital Delay",             "DD-6",     "2002-2008", 0,     DELAY_REVERB),
        new Device("Digital Reverb",            "RV-5",     "2002-2015", 0,     DELAY_REVERB),
        new Device("Super Octave",              "OC-3",     "2003-now",  0,     PITCH_MODULATION),
        new Device("Bass Synthesizer",          "SYB-5",    "2004-now",  0,     OTHERS),
        new Device("Acoustic Simulator",        "AC-3",     "2005-now",  0,     ACOUSTIC),
        new Device("Loop Station",              "RC-2",     "2006-2011", 0,     OTHERS),
        new Device("Metal Core",                "ML-2",     "2007-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Fuzz",                      "FZ-5",     "2007-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Dyna Drive",                "DN-2",     "2007-2012", 0,     DISTORTION_OVERDRIVE),
        new Device("Fender Bass Man",           "FBM-1",    "2007-2013", 0, BASS_PEDALS + AMP_EMULATOR),
        new Device("Fender Deluxe Reverb",      "FDR-1",    "2007-2013", 0,     AMP_EMULATOR),
        new Device("Digital Delay",             "DD-7",     "2008-now",  0,     DELAY_REVERB),
        new Device("Chromatic Tuner",           "TU-3",     "2009-now",  0,     OTHERS),
        new Device("Fender Reverb",             "FRV-1",    "2009-2019", 0,     AMP_EMULATOR),
        new Device("Harmonist",                 "PS-6",     "2010-now",  0,     PITCH_MODULATION),
        new Device("Power Stack",               "ST-2",     "2010-now",  0,     AMP_EMULATOR),
        new Device("Loop Station",              "RC-3",     "2011-now",  0,     OTHERS),
        new Device("Combo Drive",               "BC-2",     "2011-2019", 0,     DISTORTION_OVERDRIVE),//
        new Device("Feedbacker/Booster",        "FB-2",     "2011-2015", 0,     DYNAMICS_FILTER),
        new Device("Tera Echo",                 "TE-2",     "2013-now",  0,     DELAY_REVERB),
        new Device("Adaptive Distortion",       "DA-2",     "2013-2014", 0,     DISTORTION_OVERDRIVE),
        new Device("Multi Overtone",            "MO-2",     "2013-now",  0,     PITCH_MODULATION),
        new Device("OverDrive",                 "OD-1X",    "2014-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Distortion",                "DS-1X",    "2014-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Blues Driver",              "BD-2W",    "2014-now",  0, DISTORTION_OVERDRIVE + WAZA_CRAFT),//
        new Device("SUPER OverDrive",           "SD-1W",    "2014-now",  0, DISTORTION_OVERDRIVE + WAZA_CRAFT),//
        new Device("Loop Station",              "RC-1",     "2014-now",  0,     OTHERS),
        new Device("Delay",                     "DM-2W",    "2015-now",  0, WAZA_CRAFT + DELAY_REVERB),
        new Device("Bass Driver",               "BB-1X",    "2015-now",  0,     BASS_PEDALS),
        new Device("Reverb",                    "RV-6",     "2015-now",  0,     DELAY_REVERB),
        new Device("Vocoder",                   "VO-1",     "2016-now",  0,     OTHERS),
        new Device("Vibrato",                   "VB-2W",    "2016-now",  0, PITCH_MODULATION + WAZA_CRAFT),
        new Device("Bass Comp",                 "BC-1X",    "2016-now",  0, BASS_PEDALS + DYNAMICS_FILTER),
        new Device("Chromatic Tuner",           "TU-3S",    "2016-now",  0,     OTHERS),
        new Device("Chromatic Tuner",           "TU-3W",    "2016-now",  0, OTHERS + WAZA_CRAFT),
        new Device("Chorus",                    "CE-2W",    "2016-now",  0, CHORUS + WAZA_CRAFT + PITCH_MODULATION),
        new Device("Acoustic Preamp",           "AD-2",     "2016-now",  0,     ACOUSTIC),
        new Device("Compressor",                "CP-1X",    "2016-now",  0,     DYNAMICS_FILTER),
        new Device("Distortion",                "DS-1-4A",  "2017",      0,     DISTORTION_OVERDRIVE),
        new Device("Angry Driver",              "JB-2",     "2017-now",  0,     DISTORTION_OVERDRIVE),//
        new Device("Metal Zone",                "MT-2W",    "2018-now",  0, DISTORTION_OVERDRIVE + WAZA_CRAFT),//
        new Device("Digital Delay",             "DD-8",     "2019-now",  0,     DELAY_REVERB),
        new Device("Digital Delay",             "DD-3T",    "2019-now",  0,     DELAY_REVERB),
        new Device("Dimension C",               "DC-2W",    "2018-now",  0, CHORUS + PITCH_MODULATION + WAZA_CRAFT),
        new Device("Synthesizer",               "SY-1",     "2019-now",  0,     OTHERS),
        new Device("Octaver",                   "OC-5",     "2020-now",  0,     PITCH_MODULATION),
        new Device("Loop Station",              "RC-5",     "2020-now",  0,     OTHERS),
        new Device("Tone Bender",               "TB-2W",    "2021-now",  0, DISTORTION_OVERDRIVE + WAZA_CRAFT),//
        new Device("Heavy Metal",               "HM-2W",    "2021-now",  0, DISTORTION_OVERDRIVE + WAZA_CRAFT),
        new Device("Metal Zone",                "MT-2-3A",  "2021",      0,     DISTORTION_OVERDRIVE),
        new Device("Super Overdrive",           "SD-1-4A",  "2021",      0,     DISTORTION_OVERDRIVE),
        //20 Series
        new Device("Chorus Ensemble",           "CE-20",    "???", 0, SERIES_20 + CHORUS + PITCH_MODULATION),//
        new Device("Giga Delay",                "DD-20",    "???", 0, SERIES_20 + DELAY_REVERB),
        new Device("Advanced EQ",               "EQ-20",    "???", 0, SERIES_20 + DYNAMICS_FILTER),
        new Device("Amp Factory",               "GP-20",    "???", 0, SERIES_20 + AMP_EMULATOR),
        new Device("Poly Octave",               "OC-20G",   "???", 0, SERIES_20 + PITCH_MODULATION),//
        new Device("Drive Zone",                "OD-20",    "???", 0, SERIES_20 + DISTORTION_OVERDRIVE),
        new Device("Loop Station",              "RC-20",    "???", 0, SERIES_20 + OTHERS),
        new Device("Loop Station",              "RC-20XL",  "???", 0, SERIES_20 + OTHERS),
        new Device("Loop Station",              "RC-30",    "???", 0, SERIES_20 + OTHERS),
        new Device("Space Echo",                "RE-20",    "???", 0, SERIES_20 + DELAY_REVERB),
        new Device("Rotary Ensemble",           "RT-20",    "???", 0, SERIES_20 + PITCH_MODULATION),//
        new Device("Slicer",                    "SL-20",    "???", 0, SERIES_20 + OTHERS),
        new Device("Vocal Performer",           "VE-20",    "???", 0, SERIES_20 + OTHERS),
        new Device("Wave Processor",            "WP-20G",   "???", 0, SERIES_20 + OTHERS),
        new Device("V-Guitar Distortion",       "GR-D",     "???", 0, SERIES_20 + OTHERS),
        new Device("V-Guitar Space",            "GR-S",     "???", 0, SERIES_20 + OTHERS),
        //10 Series
        new Device("Compressor Limiter",        "RCL-10",   "???", 0, DYNAMICS_FILTER),//
        new Device("Graphic Equalizer",         "RGE-10",   "???", 0, DYNAMICS_FILTER),//
        new Device("Digital Delay",             "RDD-10",   "???", 0, DELAY_REVERB),//
        new Device("Phaser",                    "RPH-10",   "???", 0, PITCH_MODULATION),//
        new Device("Flanger",                   "RBF-10",   "???", 0, PITCH_MODULATION),//
        new Device("Digital Chorus Ensemble",   "RCE-10",   "???", 0, CHORUS + PITCH_MODULATION),//
        new Device("Digital Reverb",            "RRV-10",   "???", 0, DELAY_REVERB),//
        new Device("Overdrive / Distortion",    "ROD-10",   "???", 0, DISTORTION_OVERDRIVE),//
        new Device("Pitch Shifter / Delay",     "RPS-10",   "???", 0, DELAY_REVERB + PITCH_MODULATION),//
        new Device("Preamp / Parametric EQ",    "RPQ-10",   "???", 0, DYNAMICS_FILTER),//
        new Device("Digital Sampler / Delay",   "RSD-10",   "???", 0, DELAY_REVERB),//
        new Device("Panning Delay",             "RPD-10",   "???", 0, DELAY_REVERB),//
        new Device("Power supply",              "RPW-7",    "???", 0, OTHERS)//
        };
    }



}

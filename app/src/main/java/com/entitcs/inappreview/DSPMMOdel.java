package com.entitcs.inappreview;

import org.json.JSONArray;

public class DSPMMOdel {
    String generator_size;
    String feeder_size;
    String transformer_size;
    JSONArray jsonArrayGenerator = new JSONArray();
    String name0;
    String bus_size;

    JSONArray jsonArrayUnit1 = new JSONArray();
    String unit1METER_NAME;
    String unit1MW;
    String unit1MVAR;
    JSONArray jsonArrayUnit2 = new JSONArray();
    String unit2METER_NAME;
    String unit2MW;
    String unit2MVAR;
    JSONArray jsonArrayFeeder = new JSONArray();
    String feederName0;
    String feederMETER_NAME;
    String feederMW;
    String feederMVAR;

    JSONArray jsonArrayTransformer = new JSONArray();
    String transformerName0;
    JSONArray jsonArrayTransformerUnit1 = new JSONArray();
    String transformerUnit1METER_NAME;
    String transformerUnit1MW;
    String transformerUnit1MVAR;
    JSONArray jsonArrayBus = new JSONArray();
    String busName0;
    JSONArray jsonArrayBusUnit1 = new JSONArray();
    String busUnit1METER_NAME;
    String busUnit1MW;
    String busUnit1MVAR;
}

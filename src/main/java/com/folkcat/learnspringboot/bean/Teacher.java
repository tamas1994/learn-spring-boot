package com.folkcat.learnspringboot.bean;

/**
 * Created by Tamas on 2017/7/11.
 */
public class Teacher {
    private int id;
    private String name;


    String dataStr="{\n" +
            "  \"flexImageConfig\": {\n" +
            "    \"data\": {\n" +
            "      \"imgs\": [\n" +
            "        \"./../../static/logo/700x400/3U.gif\",\n" +
            "        \"./../../static/logo/700x400/MF.gif\",\n" +
            "        \"./../../static/logo/700x400/MF.gif\",\n" +
            "        \"./../../static/logo/700x400/MF.gif\",\n" +
            "        \"./../../static/logo/700x400/MF.gif\",\n" +
            "        \"./../../static/logo/700x400/MF.gif\",\n" +
            "        \"./../../static/logo/700x400/MF.gif\"\n" +
            "      ],\n" +
            "      \"text\": \"Economy Class\"\n" +
            "    },\n" +
            "    \"bodyStyle\": {\n" +
            "      \"minWidth\": \"1920px\",\n" +
            "      \"minHeight\": \"1080px\",\n" +
            "      \"backgroundColor\": \"#212E5B\"\n" +
            "    },\n" +
            "    \"imgConf\": {\n" +
            "      \"columnName\": \"imgs\",\n" +
            "      \"style\": {\n" +
            "        \"height\": \"340px\"\n" +
            "      },\n" +
            "      \"oneTransLarge\": false,\n" +
            "      \"interval\": 2000,\n" +
            "      \"scale\": 0.5\n" +
            "    },\n" +
            "    \"textConf\": {\n" +
            "      \"columnName\": \"text\",\n" +
            "      \"style\": {\n" +
            "        \"fontSize\": \"150px\",\n" +
            "        \"color\": \"#FAC35A\"\n" +
            "      },\n" +
            "      \"scale\": 0.3\n" +
            "    }\n" +
            "  },\n" +
            "  \"nonListConfig\": {\n" +
            "    \"bodyStyle\": {\n" +
            "      \"minWidth\": \"1920px\",\n" +
            "      \"minHeight\": \"1080px\",\n" +
            "      \"backgroundColor\": \"#212E5B\"\n" +
            "    },\n" +
            "    \"flightData\": {\n" +
            "      \"flight\": \"9C8636\",\n" +
            "      \"destinationCN\": \"大阪\",\n" +
            "      \"destinationEN\": \"Osaka\",\n" +
            "      \"logo\": \"./../../static/logo/700x400/9C.gif\",\n" +
            "      \"airlinesCN\": \"春秋航空\",\n" +
            "      \"airlinesEN\": \"APRING AIRLINES\",\n" +
            "      \"engineRoomCN\": \"经济舱柜台\",\n" +
            "      \"engineRoomEN\": \"Economy Class\",\n" +
            "      \"bordingTimeLabelCN\": \"预计登机\",\n" +
            "      \"bordingTimeLabelEN\": \"Bording Time\",\n" +
            "      \"bordingTime\": \"11:50\",\n" +
            "      \"checkInTimeLabelCN\": \"办理时间\",\n" +
            "      \"checkInTimeLabelEN\": \"Check-In Time\",\n" +
            "      \"checkInTime\": \"09:20 - 11:20\",\n" +
            "      \"gateLabelCN\": \"登机口\",\n" +
            "      \"gateLabelEN\": \"Gate\",\n" +
            "      \"gate\": \"04\",\n" +
            "      \"flightStatusLabelCN\": \"航班状态\",\n" +
            "      \"flightStatusLabelEN\": \"Status\",\n" +
            "      \"flightStatusCN\": \"登机\",\n" +
            "      \"flightStatusEN\": \"Boarding\"\n" +
            "    },\n" +
            "    \"rows\": [\n" +
            "      {\n" +
            "        \"type\": \"Row\",\n" +
            "        \"align\": \"top\",\n" +
            "        \"justify\": \"start\",\n" +
            "        \"cols\": [\n" +
            "          {\n" +
            "            \"type\": \"Column\",\n" +
            "            \"span\": 13,\n" +
            "            \"children\": [\n" +
            "              {\n" +
            "                \"type\": \"DoubleLayerText\",\n" +
            "                \"content\": {\n" +
            "                  \"topStyle\": {\n" +
            "                    \"fontSize\": \"160px\",\n" +
            "                    \"color\": \"#FAC35A\",\n" +
            "                    \"borderBottom\": \"5px solid\",\n" +
            "                    \"paddingLeft\": \"80px\"\n" +
            "                  },\n" +
            "                  \"bottomStyle\": {},\n" +
            "                  \"topContent\": [\n" +
            "                    {\n" +
            "                      \"type\": \"Text\",\n" +
            "                      \"columnName\": \"flight\"\n" +
            "                    }\n" +
            "                  ],\n" +
            "                  \"bottomContent\": [\n" +
            "                    {\n" +
            "                      \"type\": \"Row\",\n" +
            "                      \"align\": \"middle\",\n" +
            "                      \"justify\": \"start\",\n" +
            "                      \"cols\": [\n" +
            "                        {\n" +
            "                          \"type\": \"Column\",\n" +
            "                          \"span\": 12,\n" +
            "                          \"children\": [\n" +
            "                            {\n" +
            "                              \"type\": \"DoubleLayerText\",\n" +
            "                              \"content\": {\n" +
            "                                \"topStyle\": {\n" +
            "                                  \"fontSize\": \"42px\",\n" +
            "                                  \"color\": \"#fff\",\n" +
            "                                  \"paddingLeft\": \"80px\"\n" +
            "                                },\n" +
            "                                \"bottomStyle\": {\n" +
            "                                  \"fontSize\": \"42px\",\n" +
            "                                  \"color\": \"#fff\",\n" +
            "                                  \"paddingLeft\": \"80px\"\n" +
            "                                },\n" +
            "                                \"topContent\": [\n" +
            "                                  {\n" +
            "                                    \"type\": \"Text\",\n" +
            "                                    \"columnName\": \"bordingTimeLabelCN\"\n" +
            "                                  }\n" +
            "                                ],\n" +
            "                                \"bottomContent\": [\n" +
            "                                  {\n" +
            "                                    \"type\": \"Text\",\n" +
            "                                    \"columnName\": \"bordingTimeLabelEN\"\n" +
            "                                  }\n" +
            "                                ]\n" +
            "                              }\n" +
            "                            }\n" +
            "                          ]\n" +
            "                        },\n" +
            "                        {\n" +
            "                          \"type\": \"Column\",\n" +
            "                          \"span\": 12,\n" +
            "                          \"children\": [\n" +
            "                            {\n" +
            "                              \"type\": \"DoubleLayerText\",\n" +
            "                              \"content\": {\n" +
            "                                \"topStyle\": {\n" +
            "                                  \"fontSize\": \"42px\",\n" +
            "                                  \"color\": \"#FAC35A\"\n" +
            "                                },\n" +
            "                                \"bottomStyle\": {},\n" +
            "                                \"topContent\": [\n" +
            "                                  {\n" +
            "                                    \"type\": \"Text\",\n" +
            "                                    \"columnName\": \"bordingTime\"\n" +
            "                                  }\n" +
            "                                ],\n" +
            "                                \"bottomContent\": []\n" +
            "                              }\n" +
            "                            }\n" +
            "                          ]\n" +
            "                        }\n" +
            "                      ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                      \"type\": \"Row\",\n" +
            "                      \"align\": \"middle\",\n" +
            "                      \"justify\": \"start\",\n" +
            "                      \"cols\": [\n" +
            "                        {\n" +
            "                          \"type\": \"Column\",\n" +
            "                          \"span\": 12,\n" +
            "                          \"children\": [\n" +
            "                            {\n" +
            "                              \"type\": \"DoubleLayerText\",\n" +
            "                              \"content\": {\n" +
            "                                \"topStyle\": {\n" +
            "                                  \"fontSize\": \"42px\",\n" +
            "                                  \"color\": \"#fff\",\n" +
            "                                  \"paddingLeft\": \"80px\"\n" +
            "                                },\n" +
            "                                \"bottomStyle\": {\n" +
            "                                  \"fontSize\": \"42px\",\n" +
            "                                  \"color\": \"#fff\",\n" +
            "                                  \"paddingLeft\": \"80px\"\n" +
            "                                },\n" +
            "                                \"topContent\": [\n" +
            "                                  {\n" +
            "                                    \"type\": \"Text\",\n" +
            "                                    \"columnName\": \"flightStatusLabelCN\"\n" +
            "                                  }\n" +
            "                                ],\n" +
            "                                \"bottomContent\": [\n" +
            "                                  {\n" +
            "                                    \"type\": \"Text\",\n" +
            "                                    \"columnName\": \"flightStatusLabelEN\"\n" +
            "                                  }\n" +
            "                                ]\n" +
            "                              }\n" +
            "                            }\n" +
            "                          ]\n" +
            "                        },\n" +
            "                        {\n" +
            "                          \"type\": \"Column\",\n" +
            "                          \"span\": 12,\n" +
            "                          \"children\": [\n" +
            "                            {\n" +
            "                              \"type\": \"DoubleLayerText\",\n" +
            "                              \"content\": {\n" +
            "                                \"topStyle\": {\n" +
            "                                  \"fontSize\": \"42px\",\n" +
            "                                  \"color\": \"#FAC35A\"\n" +
            "                                },\n" +
            "                                \"bottomStyle\": {\n" +
            "                                  \"fontSize\": \"42px\",\n" +
            "                                  \"color\": \"#FAC35A\"\n" +
            "                                },\n" +
            "                                \"topContent\": [\n" +
            "                                  {\n" +
            "                                    \"type\": \"Text\",\n" +
            "                                    \"transColor\": {\n" +
            "                                      \"登机\": \"#ff0000\",\n" +
            "                                      \"Boarding\": \"#ff0000\",\n" +
            "                                      \"延误\": \"#FFFF00\",\n" +
            "                                      \"delay\": \"#FFFF00\"\n" +
            "                                    },\n" +
            "                                    \"columnName\": \"flightStatusCN\"\n" +
            "                                  }\n" +
            "                                ],\n" +
            "                                \"bottomContent\": [\n" +
            "                                  {\n" +
            "                                    \"type\": \"Text\",\n" +
            "                                    \"transColor\": {\n" +
            "                                      \"登机\": \"#ff0000\",\n" +
            "                                      \"Boarding\": \"#ff0000\",\n" +
            "                                      \"延误\": \"#FFFF00\",\n" +
            "                                      \"delay\": \"#FFFF00\"\n" +
            "                                    },\n" +
            "                                    \"columnName\": \"flightStatusEN\"\n" +
            "                                  }\n" +
            "                                ]\n" +
            "                              }\n" +
            "                            }\n" +
            "                          ]\n" +
            "                        }\n" +
            "                      ]\n" +
            "                    }\n" +
            "                  ]\n" +
            "                }\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          {\n" +
            "            \"type\": \"Column\",\n" +
            "            \"span\": 11,\n" +
            "            \"children\": [\n" +
            "              {\n" +
            "                \"type\": \"DoubleLayerText\",\n" +
            "                \"content\": {\n" +
            "                  \"topStyle\": {\n" +
            "                    \"paddingTop\": \"20px\",\n" +
            "                    \"paddingRight\": \"20px\",\n" +
            "                    \"textAlign\": \"center\"\n" +
            "                  },\n" +
            "                  \"bottomStyle\": {},\n" +
            "                  \"topContent\": [\n" +
            "                    {\n" +
            "                      \"type\": \"Image\",\n" +
            "                      \"style\": {\n" +
            "                        \"width\": \"535px\",\n" +
            "                        \"height\": \"320px\"\n" +
            "                      },\n" +
            "                      \"columnName\": \"logo\"\n" +
            "                    }\n" +
            "                  ],\n" +
            "                  \"bottomContent\": [\n" +
            "                    {\n" +
            "                      \"type\": \"DoubleLayerText\",\n" +
            "                      \"content\": {\n" +
            "                        \"align\": \"right\",\n" +
            "                        \"translateX\": \"-250px\",\n" +
            "                        \"topStyle\": {\n" +
            "                          \"fontSize\": \"32px\",\n" +
            "                          \"color\": \"#FAC35A\",\n" +
            "                          \"paddingLeft\": \"80px\"\n" +
            "                        },\n" +
            "                        \"bottomStyle\": {\n" +
            "                          \"fontSize\": \"32px\",\n" +
            "                          \"color\": \"#FAC35A\",\n" +
            "                          \"paddingLeft\": \"80px\"\n" +
            "                        },\n" +
            "                        \"topContent\": [\n" +
            "                          {\n" +
            "                            \"type\": \"Text\",\n" +
            "                            \"columnName\": \"airlinesCN\"\n" +
            "                          }\n" +
            "                        ],\n" +
            "                        \"bottomContent\": [\n" +
            "                          {\n" +
            "                            \"type\": \"Text\",\n" +
            "                            \"columnName\": \"airlinesEN\"\n" +
            "                          }\n" +
            "                        ]\n" +
            "                      }\n" +
            "                    }\n" +
            "                  ]\n" +
            "                }\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      {\n" +
            "        \"type\": \"Row\",\n" +
            "        \"align\": \"top\",\n" +
            "        \"justify\": \"start\",\n" +
            "        \"cols\": [\n" +
            "          {\n" +
            "            \"type\": \"Column\",\n" +
            "            \"span\": 12,\n" +
            "            \"children\": [\n" +
            "              {\n" +
            "                \"type\": \"DoubleLayerText\",\n" +
            "                \"content\": {\n" +
            "                  \"topStyle\": {\n" +
            "                    \"fontSize\": \"144px\",\n" +
            "                    \"color\": \"#FAC35A\",\n" +
            "                    \"paddingLeft\": \"80px\"\n" +
            "                  },\n" +
            "                  \"bottomStyle\": {\n" +
            "                    \"fontSize\": \"96px\",\n" +
            "                    \"color\": \"#FAC35A\",\n" +
            "                    \"paddingLeft\": \"80px\"\n" +
            "                  },\n" +
            "                  \"topContent\": [\n" +
            "                    {\n" +
            "                      \"type\": \"Text\",\n" +
            "                      \"columnName\": \"destinationCN\"\n" +
            "                    }\n" +
            "                  ],\n" +
            "                  \"bottomContent\": [\n" +
            "                    {\n" +
            "                      \"type\": \"Text\",\n" +
            "                      \"columnName\": \"destinationEN\"\n" +
            "                    }\n" +
            "                  ]\n" +
            "                }\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ]\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  \"gridConfig\": {\n" +
            "    \"langs\": [\n" +
            "      \"cn\",\n" +
            "      \"en\",\n" +
            "      \"jp\"\n" +
            "    ],\n" +
            "    \"defaultLang\": \"cn\",\n" +
            "    \"langTimer\": 15000,\n" +
            "    \"getDataApi\": \"\",\n" +
            "    \"bodyStyle\": {\n" +
            "      \"defaultRowStyle\": {\n" +
            "        \"rowStripe\": [\n" +
            "          \"#284682\",\n" +
            "          \"#1E2D5A\"\n" +
            "        ],\n" +
            "        \"fontSize\": \"32px\",\n" +
            "        \"color\": \"#fff\"\n" +
            "      },\n" +
            "      \"defaultHeaderStyle\": {\n" +
            "        \"fontSize\": \"34px\",\n" +
            "        \"color\": \"#FAC35A\",\n" +
            "        \"backgroundColor\": \"#1E2D5A\",\n" +
            "        \"textAlign\": \"center\",\n" +
            "        \"borderBottom\": \"1px solid\",\n" +
            "        \"borderBottomColor\": \"#FAC35A\",\n" +
            "        \"lineHeight\": \"100px\",\n" +
            "        \"height\": \"100px\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"columns\": [\n" +
            "      {\n" +
            "        \"name\": \"logo\",\n" +
            "        \"label\": {},\n" +
            "        \"style\": {\n" +
            "          \"width\": 120,\n" +
            "          \"height\": 80,\n" +
            "          \"minWidth\": 120,\n" +
            "          \"padding\": 0,\n" +
            "          \"paddingTop\": \"none\",\n" +
            "          \"paddingRight\": \"none\",\n" +
            "          \"paddingLeft\": \"none\",\n" +
            "          \"paddingBottom\": \"none\",\n" +
            "          \"margin\": 3,\n" +
            "          \"marginTop\": \"none\",\n" +
            "          \"marginRight\": \"none\",\n" +
            "          \"marginLeft\": \"none\",\n" +
            "          \"marginBottom\": \"none\",\n" +
            "          \"textAlign\": \"center\"\n" +
            "        },\n" +
            "        \"headerStyle\": {\n" +
            "          \"backgroundColor\": \"#1E2D5A\"\n" +
            "        },\n" +
            "        \"displayType\": \"Logo\",\n" +
            "        \"radius\": true,\n" +
            "        \"logoInterval\": 7000\n" +
            "      },\n" +
            "      {\n" +
            "        \"name\": \"flight\",\n" +
            "        \"label\": {\n" +
            "          \"cn\": \"航班号\",\n" +
            "          \"en\": \"FLIGHT\"\n" +
            "        },\n" +
            "        \"style\": {\n" +
            "          \"width\": 260,\n" +
            "          \"height\": 55,\n" +
            "          \"minWidth\": 156,\n" +
            "          \"textAlign\": \"center\",\n" +
            "          \"fontSize\": \"42px\",\n" +
            "          \"color\": \"#fff\"\n" +
            "        },\n" +
            "        \"headerStyle\": {\n" +
            "          \"backgroundColor\": \"#1E2D5A\",\n" +
            "          \"textAlign\": \"left\"\n" +
            "        },\n" +
            "        \"displayType\": \"Marquee\",\n" +
            "        \"marqueeSpeed\": 1\n" +
            "      },\n" +
            "      {\n" +
            "        \"name\": \"passby_destination\",\n" +
            "        \"label\": {\n" +
            "          \"cn\": \"经停/目的地\",\n" +
            "          \"en\": \"DESTINATION\"\n" +
            "        },\n" +
            "        \"style\": {\n" +
            "          \"width\": 290,\n" +
            "          \"height\": 55,\n" +
            "          \"minWidth\": 260,\n" +
            "          \"textAlign\": \"center\",\n" +
            "          \"fontSize\": \"32px\"\n" +
            "        },\n" +
            "        \"displayType\": \"Marquee\",\n" +
            "        \"marqueeSpeed\": 3\n" +
            "      },\n" +
            "      {\n" +
            "        \"name\": \"actualcheckinclose\",\n" +
            "        \"label\": {\n" +
            "          \"cn\": \"办理时间\",\n" +
            "          \"en\": \"TIME\"\n" +
            "        },\n" +
            "        \"style\": {\n" +
            "          \"width\": 310,\n" +
            "          \"height\": 55,\n" +
            "          \"minWidth\": 280,\n" +
            "          \"textAlign\": \"left\",\n" +
            "          \"fontSize\": \"32px\"\n" +
            "        },\n" +
            "        \"displayType\": \"Marquee\",\n" +
            "        \"marqueeSpeed\": 3\n" +
            "      },\n" +
            "      {\n" +
            "        \"name\": \"checkincounter\",\n" +
            "        \"label\": {\n" +
            "          \"cn\": \"办理柜台\",\n" +
            "          \"en\": \"COUNTER\"\n" +
            "        },\n" +
            "        \"style\": {\n" +
            "          \"height\": 55,\n" +
            "          \"minWidth\": 245,\n" +
            "          \"textAlign\": \"left\",\n" +
            "          \"fontSize\": \"32px\"\n" +
            "        },\n" +
            "        \"headerStyle\": {\n" +
            "          \"textAlign\": \"left\"\n" +
            "        },\n" +
            "        \"formatterjs\": \"induceCounter\",\n" +
            "        \"displayType\": \"Marquee\",\n" +
            "        \"marqueeSpeed\": 3\n" +
            "      },\n" +
            "      {\n" +
            "        \"name\": \"flightstatus\",\n" +
            "        \"label\": {\n" +
            "          \"cn\": \"航班状态\",\n" +
            "          \"en\": \"STATUS\"\n" +
            "        },\n" +
            "        \"style\": {\n" +
            "          \"width\": 280,\n" +
            "          \"height\": 55,\n" +
            "          \"minWidth\": 192,\n" +
            "          \"textAlign\": \"left\",\n" +
            "          \"fontSize\": \"32px\"\n" +
            "        },\n" +
            "        \"displayType\": \"Marquee\",\n" +
            "        \"marqueeSpeed\": 3\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}\n";


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Teacher id:"+id+" name:"+name;
    }
}

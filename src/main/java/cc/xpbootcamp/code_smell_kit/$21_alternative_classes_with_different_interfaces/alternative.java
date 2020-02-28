TrainingSessionData{
  private Long id;
  private TrainingSession trainingSession;
  private String trainingPath;
  private String testPath;
  private String trainingAmount;
  private String validateAmount;
}

TrainingSession{
  private Long id;
  private String name;
  private TrainingSession trainingSession;
  private String trainingDatasetPath;
  private String testingDatasetPath;
  private Date trainingInstance;
}


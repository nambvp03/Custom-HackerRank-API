package cpp.hackerrank.bean;

import java.util.HashMap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Candidate {
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("email")
	@Expose
	private String email;
	@SerializedName("full_name")
	@Expose
	private String fullName;
	@SerializedName("score")
	@Expose
	private int score;
	@SerializedName("attempt_starttime")
	@Expose
	private String attemptStarttime;
	@SerializedName("attempt_endtime")
	@Expose
	private String attemptEndtime;
	@SerializedName("status")
	@Expose
	private int status;
	@SerializedName("ats_state")
	@Expose
	private int atsState;
	/*@SerializedName("invite_email_done")
	@Expose
	private Object inviteEmailDone;
	@SerializedName("invite_valid")
	@Expose
	private Object inviteValid;
	@SerializedName("invited_on")
	@Expose
	private Object invitedOn;
	@SerializedName("invite_valid_from")
	@Expose
	private Object inviteValidFrom;
	@SerializedName("invite_valid_to")
	@Expose
	private Object inviteValidTo;
	@SerializedName("ddna_star_rating")
	@Expose
	private Object ddnaStarRating;
	@SerializedName("test_finish_url")
	@Expose
	private Object testFinishUrl;
	@SerializedName("test_result_url")
	@Expose
	private Object testResultUrl;
	@SerializedName("invite_metadata")
	@Expose
	private Object inviteMetadata;
	@SerializedName("user")
	@Expose
	private Object user;
	@SerializedName("test")
	@Expose
	private String test;
	@SerializedName("invite_link")
	@Expose
	private String inviteLink;
	@SerializedName("evaluator_mail")
	@Expose
	private Object evaluatorMail;
	@SerializedName("tags")
	@Expose
	private List<Object> tags = null;
	@SerializedName("metadata")
	@Expose
	private Metadata metadata;
	@SerializedName("report_url")
	@Expose
	private String reportUrl;
	@SerializedName("pdf_url")
	@Expose
	private String pdfUrl;*/
	@SerializedName("questions")
	@Expose
	private HashMap<String, Double> questions;
	@SerializedName("plagiarism_status")
	@Expose
	private boolean plagiarismStatus;
	/*@SerializedName("feedback")
	@Expose
	private String feedback;*/
	@SerializedName("added_time")
	@Expose
	private Object addedTime;
	@SerializedName("unclaimed_added_time")
	@Expose
	private int unclaimedAddedTime;
	@SerializedName("percentage_score")
	@Expose
	private float percentageScore;

	private double timeTaken;
	private String timeTakenString;

	private double finalScore;
	
	private int rank;
	
	private int questionSolved;

	/**
	 * @return the timeTakenString
	 */
	public String getTimeTakenString() {
		return timeTakenString;
	}

	/**
	 * @param timeTakenString the timeTakenString to set
	 */
	public void setTimeTakenString(String timeTakenString) {
		this.timeTakenString = timeTakenString;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the attemptStarttime
	 */
	public String getAttemptStarttime() {
		return attemptStarttime;
	}

	/**
	 * @param attemptStarttime the attemptStarttime to set
	 */
	public void setAttemptStarttime(String attemptStarttime) {
		this.attemptStarttime = attemptStarttime;
	}

	/**
	 * @return the attemptEndtime
	 */
	public String getAttemptEndtime() {
		return attemptEndtime;
	}

	/**
	 * @param attemptEndtime the attemptEndtime to set
	 */
	public void setAttemptEndtime(String attemptEndtime) {
		this.attemptEndtime = attemptEndtime;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the atsState
	 */
	public int getAtsState() {
		return atsState;
	}

	/**
	 * @param atsState the atsState to set
	 */
	public void setAtsState(int atsState) {
		this.atsState = atsState;
	}

	/**
	 * @return the questions
	 */
	public HashMap<String, Double> getQuestions() {
		return questions;
	}

	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(HashMap<String, Double> questions) {
		this.questions = questions;
	}

	/**
	 * @return the plagiarismStatus
	 */
	public boolean isPlagiarismStatus() {
		return plagiarismStatus;
	}

	/**
	 * @param plagiarismStatus the plagiarismStatus to set
	 */
	public void setPlagiarismStatus(boolean plagiarismStatus) {
		this.plagiarismStatus = plagiarismStatus;
	}

	/**
	 * @return the addedTime
	 */
	public Object getAddedTime() {
		return addedTime;
	}

	/**
	 * @param addedTime the addedTime to set
	 */
	public void setAddedTime(Object addedTime) {
		this.addedTime = addedTime;
	}

	/**
	 * @return the unclaimedAddedTime
	 */
	public int getUnclaimedAddedTime() {
		return unclaimedAddedTime;
	}

	/**
	 * @param unclaimedAddedTime the unclaimedAddedTime to set
	 */
	public void setUnclaimedAddedTime(int unclaimedAddedTime) {
		this.unclaimedAddedTime = unclaimedAddedTime;
	}

	/**
	 * @return the percentageScore
	 */
	public float getPercentageScore() {
		return percentageScore;
	}

	/**
	 * @param percentageScore the percentageScore to set
	 */
	public void setPercentageScore(float percentageScore) {
		this.percentageScore = percentageScore;
	}

	/**
	 * @return the timeTaken
	 */
	public double getTimeTaken() {
		return timeTaken;
	}

	/**
	 * @param timeTaken the timeTaken to set
	 */
	public void setTimeTaken(double timeTaken) {
		this.timeTaken = timeTaken;
	}

	/**
	 * @return the finalScore
	 */
	public double getFinalScore() {
		return finalScore;
	}

	/**
	 * @param finalScore the finalScore to set
	 */
	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}

	/**
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @return the questionSolved
	 */
	public int getQuestionSolved() {
		return questionSolved;
	}

	/**
	 * @param questionSolved the questionSolved to set
	 */
	public void setQuestionSolved(int questionSolved) {
		this.questionSolved = questionSolved;
	}
}

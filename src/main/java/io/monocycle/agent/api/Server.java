package io.monocycle.agent.api;

/**
 * Server
 */
public class Server {

	private String hostname;

	private String description;

	private ServerSummary serverSummary;

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ServerSummary getServerSummary() {
		return serverSummary;
	}

	public void setServerSummary(ServerSummary serverSummary) {
		this.serverSummary = serverSummary;
	}

}

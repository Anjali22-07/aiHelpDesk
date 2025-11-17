## AI Helpdesk Agent

AI Helpdesk Agent is an intelligent support system designed to assist students with common queries and issues. It can answer basic questions instantly and create support tickets for more complex, technical, or account-related problems.

## Features

- Instant Help for Students: Provides answers to frequently asked questions or basic guidance.
- Automated Ticket Creation: When a student mentions an ongoing ticket, account issues, or complex technical problems, the agent automatically creates a support ticket for follow-up.
- Mentor Assignment: Tickets are automatically assigned to mentors who specialize in the relevant field, ensuring that students get expert assistance quickly.
- Context-Aware Responses: Understands the user query and determines whether it can resolve the issue or escalate it.
- Seamless Student Support: Bridges the gap between automated help and human support teams.

## WorkFlow

- The student asks a question or reports an issue.
- The AI agent evaluates the query:
- If it’s a basic problem, it provides an instant response.
- If it’s a complex or account-related issue, it creates a ticket in the support system.

## Technologies Used

- OpenAI For understanding student queries.
- Backend: Spring Boot, spring AI
- Database: MySQL-  To store tickets, mentor details, and user interactions.
- Spring Data JPA / Hibernate: For ticket and mentor management in the database.
- RestAPI Integration: To communicate with ticketing or helpdesk systems.

## Installation

1.Clone the repository:
```
git clone https://github.com/yourusername/ai-helpdesk-agent.git

```

2. Navigate to the project directory:
```
cd ai-helpdesk-agent

```

3. Build the project with Maven or Gradle:


```
mvn clean install

```

4. Run the Spring Boot application:
```
# Maven
mvn spring-boot:run

```

5.Access the API endpoints at http://localhost:8080.

## Usage

- Interact with the agent through the chat interface.
- Ask questions about common student issues like password reset, registration queries, or general guidance.
- For complex issues or ongoing tickets, the agent will automatically create a support ticket and assign it to a mentor specializing in the relevant field.
- The ticket is assigned to a mentor who specializes in the relevant field.
- The agent confirms ticket creation and mentor assignment to the student, providing ticket details.

## Contributing

- Contributions are welcome! If you want to improve the AI model, enhance ticketing features, or fix bugs:
- Fork the repository.
- Create a new branch: git checkout -b feature/your-feature-name.
- Commit your changes: git commit -m "Add feature".
- Push to the branch: git push origin feature/your-feature-name.
- Open a pull request.

License

This project is licensed under the MIT License
.

# chainResponsibilityPatternTwo
<h3>Software Engineering 2 | Lab Assignment 3</h3>

<h3>Problem Statement:</h3>
<b>Automated Waste Management System</b><br><br>
<b>Background:</b> Municipalities and cities face significant challenges in managing and efficiently disposing of waste. Traditional waste collection methods often result in delays, inefficiencies, and high operational costs. An innovative solution is needed to automate the waste management process, ensuring timely collection and disposal while optimizing resource utilization.<br><br>
<b>Objective:</b> Develop an automated waste management system that uses a chain of responsibility pattern to ensure efficient waste collection and disposal. The system should handle different types of waste containers and trigger appropriate disposal actions based on the type and capacity of each container.<br><br>
<b>Requirements:</b><br><br>
<ol>
<li>Waste Container: Create a class to represent waste containers, each with a specific capacity and type of waste (e.g., organic, recyclable, hazardous).</li>
<li>Waste Collection Chain: Implement a chain of responsibility pattern to handle different types of waste containers. Each handler in the chain should be responsible for collecting and disposing of a specific type of waste.</li>
<li>Waste Collection Process:
<ul>
<li>The system should initialize a chain of waste collectors, each responsible for a different type of waste.</li>
<li>When a waste container is full or needs disposal, the system should trigger the waste collection process.</li>
<li>The appropriate waste collector in the chain should handle the disposal based on the type and capacity of the waste container.</li>
</ul>
</li>
<li>Validation: Ensure that waste containers are correctly identified and disposed of by the appropriate waste collector in the chain.</li>
</ol>

<h3>UML Class Diagram:</h3>
<img width="5600" height="2565" alt="AWMS_UML" src="https://github.com/user-attachments/assets/a0f32114-48c1-4342-a757-017796d35ba3" />

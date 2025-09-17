# Port-Container-Management_Act2
A console-based Port Container Management System that simulates real-world container and ship handling at a shipping port. Containers are managed using a stack (LIFO), while ships are managed using a queue (FIFO). The system allows storing containers, registering ships, viewing the current port state, and loading containers onto ships.

# 🚢 Port Container Management System  

A console-based Java application that simulates the operations of a shipping port.  
The system manages **containers arriving on trucks (stack)** and **ships waiting at the dock (queue)**.  
When loading, the top container is assigned to the first ship in line.  

---

## ✨ Features  

- **Store Container (Stack – LIFO)**  
  - Add containers with ID, description, and weight.  
- **View Port Containers**  
  - Display containers from top to bottom of the stack.  
- **Register Arriving Ship (Queue – FIFO)**  
  - Add ships with name and captain.  
- **View Waiting Ships**  
  - Display ships from front to rear of the queue.  
- **Load Next Ship**  
  - Pop container + poll ship → load container onto ship.  

---

## 📂 Project Structure  

- `Container` – Represents a port container (id, description, weight).  
- `Ship` – Represents an arriving ship (name, captain).  
- `Main` – Console menu and system logic using **ArrayDeque**.  

---

## 🖥️ Sample Menu  

=== Port Container Management System ===
- [1] Store container (push)
- [2] View port containers
- [3] Register arriving ship (enqueue)
- [4] View waiting ships
- [5] Load next ship (pop container + poll ship)
- [0] Exit


---

## 📋 Example Outputs  

### Storing a Container
![sam1](https://github.com/user-attachments/assets/ac57798f-cfc6-4291-a5de-6cc1c422995c)

![sam2](https://github.com/user-attachments/assets/c1545ccf-1dc7-4fcc-834e-aac2bf31b09a)

![sam3](https://github.com/user-attachments/assets/f5fd54df-895b-4c25-8eeb-bd7db11733a0)

### Viewing Containers
![con1](https://github.com/user-attachments/assets/14a2c055-9a3c-4b32-b87c-1d77f80aadc5)

### Registering a Ship
![ship1](https://github.com/user-attachments/assets/778c6d08-0d82-4bfd-8b69-bd00b2d1e590)

![ship2](https://github.com/user-attachments/assets/993e0f11-731f-4f5a-a6e6-de800b73a198)

### Viewing Ships
![vship](https://github.com/user-attachments/assets/b30f5025-a1c8-4625-8ee9-8f47b8c11893)

### Loading a Ship
![loadship](https://github.com/user-attachments/assets/add479b9-b8d7-4dda-9e00-3c072c14e6dd)


---

## ⚙️ Technologies Used  

- **Java SE**  
- **ArrayDeque** for stack & queue operations  

---

## 👨‍💻 Author
Created by: **LYKA JANE L. CABILLAN**













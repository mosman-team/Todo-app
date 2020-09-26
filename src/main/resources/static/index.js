

/*
document.addEventListener('DOMContentLoaded', (event) => {
    fetch('http://localhost:8080/todos').then(
        res => {
            res.json().then(
                data => {
                    displayTodos(data);
                }
            )
        }
    )
})

function displayTodos(data){
    let content = document.querySelector('.content');

    let stringData = `
                     <div>
                         <ul class="list">
                             ${data.map(item => `
                                 <li>
                                     <div class="li-content">
                                        <div class="content">
                                            <span class="title">${item.title}</span>
                                            <p class="description">${item.description}</p>
                                        </div>
                                        ${item.completed ? `<input type="checkbox" checked class="completed" onclick="return false;">` : `<input type="checkbox" class="completed" onclick="return false;">`}
                                     </div>

                                     <div class="grey-line"></div>
                                 </li>`).join('')}
                         </ul>
                     </div>
                 `;
    content.innerHTML = stringData
}
*/















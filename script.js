const productList = document.getElementById('product-list');
const addProductButton = document.getElementById('add-product');
const productForm = document.getElementById('product-form');
const productNameInput = document.getElementById('product-name');
const productQuantityInput = document.getElementById('product-quantity');
const saveProductButton = document.getElementById('save-product');

addProductButton.addEventListener('click', () => {
    productForm.style.display = 'block';
});

saveProductButton.addEventListener('click', () => {
    const productName = productNameInput.value;
    const productQuantity = productQuantityInput.value;

    const productItem = document.createElement('div');
    productItem.textContent = `Produto: ${productName}, Quantidade: ${productQuantity}`;
    productList.appendChild(productItem);

   
    productNameInput.value = '';
    productQuantityInput.value = '';
    productForm.style.display = 'none';
});

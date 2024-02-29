<form action="/buy" method="post">
    <label for="name">name</label>
    <input type="text" id="name" name="name">
    <label for="city">city</label>
    <input type="text" id="city" name="city">
    <label for="tg">telegram or whatsapp</label>
    <input type="text" id="tg" name="contact">
    <select required name="setOf">
        <option value="">Выберите сет</option>
        <option value="Мужской">Мужской</option>
        <option value="Женский">Женский</option>
    </select>
    <button type="submit">Добавить</button>
</form>
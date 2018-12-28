$(document).ready(function () {
    $('.meeting-item__new').hide();

    $('.meetings-item__add:last').on('click', (event) => {
        $('.meetings-item__add').slideUp();
        $('.meeting-item__new').slideDown();
})

    $('.new-cancel').on('click', (event) => {
        $('.meeting-item__new').slideUp();
        $('.meetings-item__add').show(100);
    });
});
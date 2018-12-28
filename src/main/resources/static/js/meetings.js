$(document).ready(function () {
    $('.meeting-item__new').hide();

    $('.meetings-item__add:last').on('click', (event) => {
        $('.meetings-item__add').slideUp();
        $('.meeting-item__new').slideDown();
        $('.meetings-item:last').toggleClass('display-block')
})

    $('.new-cancel').on('click', (event) => {
        $('.meeting-item__new').slideUp(2000);
        $('.meetings-item:last').removeClass('display-block');
        $('.meetings-item__add').slideDown(5000);
    });
});
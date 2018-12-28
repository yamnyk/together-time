$(document).ready(function () {
    $('.meeting-item__new').hide();

    $('.meetings-item__add:last').on('click', (event) => {
        $('.meetings-item__add').slideUp(100);
        $('.meeting-item__new').slideDown(100);
        $('.meetings-item:last').toggleClass('display-block')
})

    $('.new-cancel').on('click', (event) => {
        $('.meeting-item__new').slideUp('fast');
        $('.meetings-item:last').removeClass('display-block');
        $('.meetings-item__add').slideDown('slow');
    });
});
function toggleSidebarMenu() {
    let $sidebarMenu = $('.sidebar_menu');
    let $mainContent = $('.main_content');
    let $sidebarMenuButton = $('.sidebar_toggle_button');
    let $links = $('.sidebar_link_container');
    let openWidth = getComputedStyle(document.body).getPropertyValue('--sidebar_margin_open');
    let currentWidth = $sidebarMenu.css('width');
    if (openWidth === currentWidth)
        sidebarClose();
    else
        sidebarOpen();

    function sidebarOpen(){
        $sidebarMenu.css('width', 'var(--sidebar_margin_open)');
        $mainContent.css('margin-left', 'var(--sidebar_margin_open)');
        $sidebarMenuButton.text('☰ Hide menu');
        $links.show();
    }
    function sidebarClose(){
        $sidebarMenu.css('width', 'var(--sidebar_margin_closed)');
        $mainContent.css('margin-left', 'var(--sidebar_margin_closed)');
        $sidebarMenuButton.text('☰ Menu');
        $links.hide();
    }
}

/**
 * Created by dtruong1801 on 8/18/17.
 */

$( document ).ready( main );

function main() {

    $('.btn-collapse').click(function(e) {
        e.preventDefault();
        var $this = $(this);
        var $collapse = $this.closest('.collapse-group').find('.collapse');
        $collapse.collapse('toggle');
    });

}
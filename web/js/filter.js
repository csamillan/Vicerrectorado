
        function toggleChevron(e) {
		$(e.target)
				.prev('.panel-heading')
				.find("div.indicator")
				.toggleClass('fa-caret-down fa-caret-right');
	}
	$('#accordion').on('hidden.bs.collapse', toggleChevron);
	$('#accordion').on('shown.bs.collapse', toggleChevron);
       
        
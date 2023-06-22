# SmartFragment

[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Alesh-blue)](https://www.linkedin.com/in/dmitry-aleshkov)

Just a little example of how fragment lifecycle works during routing and FragmentManager methods! 

### Summary

* Routing next by replace(): First (Pause/Stop/DestroyView) and Second (Attach/Create/CreateView/ViewCreated/Start/Resume).
* Routing next by add(): First (no reaction) and Second (Attach/Create/CreateView/ViewCreated/Start/Resume).
* First hide(): First (no reaction) and Second (no reaction).
* AlertDialog and DialogFragment called on First: no reaction at all.
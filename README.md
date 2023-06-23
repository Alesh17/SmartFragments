# SmartFragment

[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Alesh-blue)](https://www.linkedin.com/in/dmitry-aleshkov)

Just a little example of how fragment lifecycle works during routing and FragmentManager methods!

### Summary

* replace(): First (Pause/Stop/DestroyView) and Second (Attach/Create/CreateView/ViewCreated/Start/Resume).
* popBackStack() after replace(): Second (Pause/Stop/DestroyView/Destroy/Detach) and First (CreateView/ViewCreated/Start/Resume).
* add(): First (no reaction) and Second (Attach/Create/CreateView/ViewCreated/Start/Resume).
* popBackStack() after add(): Second (Pause/Stop/DestroyView/Destroy/Detach) and First (no reaction).
* First hide(): First (no reaction) and Second (no reaction).
* setRetainInstance(): just removing from lifecycle methods OnCreate() and onDestroy(). 
* AlertDialog and DialogFragment called on First: no reaction at all.
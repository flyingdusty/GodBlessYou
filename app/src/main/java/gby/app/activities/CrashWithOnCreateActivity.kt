package gby.app.activities

import android.os.Bundle
import gby.app.R

class CrashWithOnCreateActivity : CrashActivity() {
    override fun getTitleId(): Int {
        return R.string.crash_with_activity_onCreate
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        throw RuntimeException(getString(getTitleId()))
    }
}
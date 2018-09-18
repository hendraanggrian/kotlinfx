package javafxx.rule

import com.github.shyiko.ktlint.core.RuleSet
import com.github.shyiko.ktlint.core.RuleSetProvider

class JavaFxxRuleSetProvider : RuleSetProvider {

    override fun get(): RuleSet = RuleSet("javafxx-rule", NoInternalClassMemberImportRule())
}
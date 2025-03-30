package hwExt1;

public abstract class Hero {
	IBehavior[] behaviors;
	IAttackBehavior attackBehavior;
	Run run;
	IDefendBehavior defendBehavior;
	protected String name;

	protected void setbehaviors(IBehavior... behaviors) {
		for (int i = 0; i < behaviors.length; i++) {

			if (behaviors[i] instanceof Run) {

				this.run = (Run) behaviors[i];

			} else if (behaviors[i] instanceof IAttackBehavior) {

				this.attackBehavior = (IAttackBehavior) behaviors[i];


			} else if (behaviors[i] instanceof IDefendBehavior) {
				this.defendBehavior = (IDefendBehavior) behaviors[i];
			}

		}
	}

	protected void attack() {
		this.attackBehavior.behavior();
	}

	protected void run() {
		this.run.behavior();
	}

	protected void defend() {
		this.defendBehavior.behavior();
	}

}

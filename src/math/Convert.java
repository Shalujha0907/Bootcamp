package math;

abstract class Convert {

    Double convertTo(double otherBase) {
     return (this.value / this.base )*  otherBase;
    }
}

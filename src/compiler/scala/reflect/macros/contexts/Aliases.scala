package scala.reflect.macros
package contexts

trait Aliases {
  self: Context =>

  override type Symbol = universe.Symbol
  override type Type = universe.Type
  override type Name = universe.Name
  override type TermName = universe.TermName
  override type TypeName = universe.TypeName
  override type Tree = universe.Tree
  override type Position = universe.Position
  override type Scope = universe.Scope
  override type Modifiers = universe.Modifiers

  override type Expr[+T] = universe.Expr[T]
  override val Expr = universe.Expr

  override type WeakTypeTag[T] = universe.WeakTypeTag[T]
  override type TypeTag[T] = universe.TypeTag[T]
  override val WeakTypeTag = universe.WeakTypeTag
  override val TypeTag = universe.TypeTag
  override def weakTypeTag[T](implicit attag: WeakTypeTag[T]) = attag
  override def typeTag[T](implicit ttag: TypeTag[T]) = ttag
  override def weakTypeOf[T](implicit attag: WeakTypeTag[T]): Type = attag.tpe
  override def typeOf[T](implicit ttag: TypeTag[T]): Type = ttag.tpe
}